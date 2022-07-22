/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Reza
 */
public class RMDashboardController implements Initializable {


    /**
     * Initializes the controller class.
     */
    @Override 
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void productOnClick(ActionEvent event) {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RMProduct.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
    } catch(Exception e) {
       
    }
    }

    @FXML
    private void staffOnClick(ActionEvent event) {
        try {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RMStaff.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }   
     catch(Exception e) {
       
    }
    }

    @FXML
    private void messageOnCllick(ActionEvent event) {
               try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RMSendMessage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }   
     catch(Exception e) {
       
    }
    }

    @FXML
    private void back(ActionEvent event) {
     Parent window1;
        try {
        window1 = FXMLLoader.load(getClass().getResource("StartScreen.fxml"));
        Stage window1Stage;
        Scene window1Scene = new Scene(window1, 600, 500);
        window1Stage = NewFXMain.parentWindow;
        window1Stage.setScene(window1Scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
}
