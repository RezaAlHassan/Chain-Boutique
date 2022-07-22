/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafxapplication1.Model.Message;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class FactoryOverseerMessageController implements Initializable {

    @FXML
    private TextArea messageArea;
    @FXML
    private CheckBox importantCheckBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitMessageOnClick(ActionEvent event) {
         Message newMessage = new Message(
         messageArea.getText(),
         "Factory Overseer");
        
                    Alert a= new Alert(Alert.AlertType.NONE);
        
        if (!messageArea.getText().isEmpty()) {
           if(importantCheckBox.isSelected()){
           
            
          try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FOmessages.bin"));
            oos.writeObject(newMessage);
            oos.close();
            messageArea.setText(null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
            a.setAlertType(Alert.AlertType.CONFIRMATION);
            a.setContentText("Important Message Sent");
            a.showAndWait(); 
        }
           else{
               try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FOmessages.bin"));
            oos.writeObject(newMessage);
            oos.close();
            messageArea.setText(null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
            a.setAlertType(Alert.AlertType.CONFIRMATION);
            a.setContentText("Message Sent");
            a.showAndWait(); 
        }
                        }
                    }
                    
    }
    

