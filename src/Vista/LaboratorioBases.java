package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sergio
 */
public class LaboratorioBases extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        

            stage.setTitle("Slamena Market");
            Parent root = FXMLLoader.load(getClass().getResource("Ventas.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

       

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
