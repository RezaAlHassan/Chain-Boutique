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
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class AdminDashboardController implements Initializable {


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void staffLinkOnClick(ActionEvent event) {
                try {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AllStaffView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("All Staff");
        stage.setScene(new Scene(root1));  
        stage.show();
        }   
     catch(Exception e) {
       
    }
    }

    @FXML
    private void expensesLinkOnClick(ActionEvent event) {
     try {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminExpenses.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Expenses");
        stage.setScene(new Scene(root1));  
        stage.show();
        }   
     catch(Exception e) {
       
    }
        

    }

    @FXML
    private void salesLinkOnClick(ActionEvent event) {
        
     try {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminSales.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Admin Sales Tab");
        stage.setScene(new Scene(root1));  
        stage.show();
        }   
     catch(Exception e) {
       
    }
    }


    @FXML
    private void messagesLinkOnClick(ActionEvent event) {
                try {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminInbox.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Admin Inbox");
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
