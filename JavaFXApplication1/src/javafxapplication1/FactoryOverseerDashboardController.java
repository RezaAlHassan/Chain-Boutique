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
public class FactoryOverseerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButton(ActionEvent event) {
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

    @FXML
    private void expensesOnClick(ActionEvent event) {
      try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FactoryOverseerExpenses.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Factory Overseer Expenses Tab");
        stage.setScene(new Scene(root1));  
        stage.show();
    } catch(Exception e) {
       
    }
    }
    


    @FXML
    private void reportOnClick(ActionEvent event) {
      try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FactoryOverseerMessage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Factory Overseer Messages Tab");
        stage.setScene(new Scene(root1));  
        stage.show();
    } catch(Exception e) {
       
    }
    }

    @FXML
    private void designOnClick(ActionEvent event) {
       try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FactoryOverseerProductD.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Factory Overseer Product Design Tab");
        stage.setScene(new Scene(root1));  
        stage.show();
    } catch(Exception e) {
       
    }
    }

    @FXML
    private void updateProductsAvailable(ActionEvent event) {
    }
    
}
