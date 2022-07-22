/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication1.Model.StoreStaff;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class RMStaffController implements Initializable {

    @FXML
    private TableView<StoreStaff> allStaffView;
    @FXML
    private TableColumn<StoreStaff, String> staffIdColumn;
    @FXML
    private TableColumn<StoreStaff, String> staffNameColumn;
    @FXML
    private TableColumn<StoreStaff, String> jobTypeColumn;
    @FXML
    private TableColumn<StoreStaff, String> salaryColumn;
    @FXML
    private TextField staffNameTextField;
    @FXML
    private TextField jobtypeTextfield;
    @FXML
    private TextField salaryTextField;
    private int aNumber = 1;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        staffIdColumn.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("staffId"));
        staffNameColumn.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("staffName"));
        jobTypeColumn.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("jobType"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("salary"));
    }    

    @FXML
    private void addStaffOnClickButton(ActionEvent event) throws FileNotFoundException {
                                    StoreStaff newStaff = new StoreStaff(
                                       aNumber++,
                                       staffNameTextField.getText(),
                                       jobtypeTextfield.getText(),
                                       Integer.parseInt(salaryTextField.getText())
                                    );
                       staffNameTextField.setText(null);    
                       jobtypeTextfield.setText(null);  
                       salaryTextField.setText(null);  
                      
                      
                       newStaff.viewStaff();//shows console output
                       
                     /*  try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("storeStaffDB.bin"));//addedto all store db to be viewed by rm
            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("staffDB.bin"));//added to allstaff db
            oos.writeObject(newStaff);
            oos2.writeObject(newStaff);
            oos.close();
            oos2.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("storeStaffDB.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            oos.writeObject(newStaff);
    }
             catch (IOException ex) {
            Logger.getLogger(RMStaffController.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(RMStaffController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}   
    
    
    
    
    }

    @FXML
    private void removeStaffOnClickButton(ActionEvent event) {
        allStaffView.getItems().removeAll(allStaffView.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void loadFromFile(ActionEvent event) {
        
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("storeStaffDB.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            StoreStaff ss;
            try{
             
                while(true){
                    ss = (StoreStaff)ois.readObject();

                    allStaffView.getItems().add(ss);
                }
                
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
                    
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
       /*                 ObjectInputStream ois=null;
                       
         try {
            StoreStaff ss;
            ois = new ObjectInputStream(new FileInputStream("storeStaffDB.bin"));
            
            ss = (StoreStaff) ois.readObject();
            ss.viewStaff();
            allStaffView.getItems().add(ss);
            
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        } */
       
    }
    
}
