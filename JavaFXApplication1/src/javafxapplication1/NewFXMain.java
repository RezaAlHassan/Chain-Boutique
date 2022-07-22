/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author Reza
 */
public class NewFXMain extends Application {
    public static Stage parentWindow;
    @Override
    public void start(Stage stg) throws Exception {
        parentWindow = stg;
        Parent root = FXMLLoader.load(getClass().getResource("StartScreen.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("FileChooserView.fxml"));
        
        Scene scene = new Scene(root);
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);        
    }

    /**
     * @param args the command line arguments
     */
    
}
