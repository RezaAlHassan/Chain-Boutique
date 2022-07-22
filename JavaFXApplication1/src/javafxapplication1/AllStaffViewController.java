/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication1.Model.FactoryStaff;
import javafxapplication1.Model.StoreStaff;


/**
 * FXML Controller class
 *
 * @author Reza
 */
public class AllStaffViewController implements Initializable {

    @FXML
    private TableView<StoreStaff> allStoreStaffView;
    @FXML
    private TableColumn<StoreStaff, String> storeStaffIdColumn;
    @FXML
    private TableColumn<StoreStaff, String> storeStaffNameColumn;
    @FXML
    private TableColumn<StoreStaff, String> storeStaffJobType;
    @FXML
    private TableColumn<StoreStaff, String> storeStaffSalaryColumn;
    @FXML
    private TableView<FactoryStaff> allFactoryStaffView;
    @FXML
    private TableColumn<FactoryStaff, String> factoryStaffIdColumn;
    @FXML
    private TableColumn<FactoryStaff, String> factoryStaffNameColumn;
    @FXML
    private TableColumn<FactoryStaff, String> factoryStaffJobTypeColumn;
    @FXML
    private TableColumn<FactoryStaff, String> factoryStaffSalaryColumn;
    private int aNumber = 1;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        storeStaffIdColumn.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("staffId"));
        storeStaffNameColumn.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("staffName"));
        storeStaffJobType.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("jobType"));
        storeStaffSalaryColumn.setCellValueFactory(new PropertyValueFactory<StoreStaff,String>("salary"));
        
        factoryStaffIdColumn.setCellValueFactory(new PropertyValueFactory<FactoryStaff,String>("staffId"));
        factoryStaffNameColumn.setCellValueFactory(new PropertyValueFactory<FactoryStaff,String>("staffName"));
        factoryStaffJobTypeColumn.setCellValueFactory(new PropertyValueFactory<FactoryStaff,String>("jobType"));
        factoryStaffSalaryColumn.setCellValueFactory(new PropertyValueFactory<FactoryStaff,String>("salary"));
    }            
            
    @FXML
    private void loadStoreStaffDB(ActionEvent event) throws IOException, ClassNotFoundException {
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

                    allStoreStaffView.getItems().add(ss);
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
            
    }

    @FXML
    private void loadfactoryStaff(ActionEvent event) {
            
      allFactoryStaffView.getItems().add(
      new FactoryStaff(aNumber++, "John Lennon", "Supervisor", 1000));
      allFactoryStaffView.getItems().add(
      new FactoryStaff(aNumber++, "Felix Johnson", "Designer", 300));
      allFactoryStaffView.getItems().add(
      new FactoryStaff(aNumber++, "Samantha Sarah", "Designer", 100));
      allFactoryStaffView.getItems().add(
      new FactoryStaff(aNumber++, "Jimmy Hendrix", "Oprations Maanager", 200)); 
      allFactoryStaffView.getItems().add(
      new FactoryStaff(aNumber++, "Dwayne Johnson", "Accounts Officer", 500));      
      allFactoryStaffView.getItems().add(
      new FactoryStaff(aNumber++, "Harry Potter", "Driver", 100));
            

    }
    
}
