/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
    private void handleButtonEntar(ActionEvent event)throws Exception {
        System.exit(0);   
}
    
}
