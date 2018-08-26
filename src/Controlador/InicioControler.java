/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
 
import Modelo.Empleado;
import Modelo.Mensaje;
import Modelo.Recibido;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author sergio
 */
public class InicioControler implements Initializable {

    @FXML
    private AnchorPane PanelPrincipal;
    @FXML
    private ImageView imagen;
    @FXML
    private AnchorPane Panel;
    @FXML
    private Label Usuario;
    @FXML
    private Label Contraseña;
    @FXML
    private TextField TxUsuario;
    @FXML
    private Button Entrar;
    @FXML
    private PasswordField TxContraseña;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TxUsuario.setText("introduzca usuario");
        TxContraseña.setText("Contraseña");

    }

    public void pv() throws Exception {

    }

    @FXML
    private void handleButtonEntar(ActionEvent event) throws Exception { 
        //Primer envio de Socket
        Socket socket = new Socket("localhost", 8000);

        ObjectOutputStream escribir = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream leer = new ObjectInputStream(socket.getInputStream());
        Empleado em = new Empleado();

        em.setIdPersona(Long.parseLong(TxUsuario.getText().trim()));
        em.setContrasena(TxUsuario.getText().trim());
        Mensaje msg = new Mensaje("1", "null", em);

        escribir.writeObject(msg);

        Recibido reci = (Recibido) leer.readObject();

        if (reci.isBool()) {
            int n = (int) reci.getOb();
            if (n == 1) {
                System.out.println("ENTRA");
            } else {

            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }

    }

}
