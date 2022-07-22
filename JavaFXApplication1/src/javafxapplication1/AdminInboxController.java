/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafxapplication1.Model.Message;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class AdminInboxController implements Initializable {

    @FXML
    private TextArea textBox;
    private ArrayList<Message> messageArr = new ArrayList<Message>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadRMOnClick(ActionEvent event) {
                ObjectInputStream ois=null;
         try {
             Message m;
             //FileInputStream fis = new FileInputStream("stud2.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("RMmessages.bin"));
             
            textBox.setText(null);
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                m = (Message) ois.readObject();
                //studArr.add((Student) ois.readObject());
                textBox.appendText(m.getMessageBody()+"\n");
                //outputTxtArea.appendText(s+"\n");
            }
            //ois.close();
                       
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
    }

    @FXML
    private void loadFOOnClick(ActionEvent event) {
        
                        ObjectInputStream ois=null;
         try {
             Message m;
             //FileInputStream fis = new FileInputStream("stud2.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("FOmessages.bin"));
             
            textBox.setText(null);
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                m = (Message) ois.readObject();
                //studArr.add((Student) ois.readObject());
                textBox.appendText(m.getMessageBody()+"\n");
                //outputTxtArea.appendText(s+"\n");
            }
            //ois.close();
                       
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
        
}


    @FXML
    private void loadRAOnClick(ActionEvent event) {
                          ObjectInputStream ois=null;
         try {
             Message m;
             //FileInputStream fis = new FileInputStream("stud2.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("RAmessages.bin"));
             
            textBox.setText(null);
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                m = (Message) ois.readObject();
                //studArr.add((Student) ois.readObject());
                textBox.appendText(m.getMessageBody()+"\n");
                //outputTxtArea.appendText(s+"\n");
            }
            //ois.close();
                       
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
    }

    @FXML
    private void loadFeedbackOnClick(ActionEvent event) {
    }
    
}
