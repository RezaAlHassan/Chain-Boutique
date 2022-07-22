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
import javafx.scene.control.TextField;
import javafxapplication1.Model.Product;
import javafxapplication1.Model.Sale;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class RASalesController implements Initializable {

    @FXML
    private TextField productIdTextField;
    @FXML
    private TextField itemsSoldTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitOnClick(ActionEvent event) {
       Alert a= new Alert(Alert.AlertType.NONE);
       double sales;
       int itemsSold=Integer.parseInt(itemsSoldTextField.getText());
       Product pp = new Product(); 
       int productId=Integer.parseInt(productIdTextField.getText());
       //have to read from file and put instances in loop until i find the product id which matches the one in text field
       if(productId==pp.getProductId(Integer.parseInt(productIdTextField.getText()))){
           sales=itemsSold* pp.getProductPrice(productId);
           //calcOfTotalSales by passing the id as paramater by converting it from string to int
           
           Sale s=new Sale(productId, itemsSold, sales);
           
           
           try {
               ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Sales.bin"));
               oos.writeObject(s);
               oos.close();
               itemsSoldTextField.setText(null);
               a.setAlertType(Alert.AlertType.INFORMATION);
               a.setContentText("Report Sent");
               a.showAndWait();
               
               
           } catch (IOException ex) {
               ex.printStackTrace();
           }
       }
       else{a.setAlertType(Alert.AlertType.INFORMATION);
       a.setContentText("Product Id does not match one in the database");
       a.showAndWait(); }
    }
    }
    
    

