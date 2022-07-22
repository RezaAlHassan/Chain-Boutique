/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafxapplication1.Model.StoreExpense;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class RAExpensesController implements Initializable {

    @FXML
    private TextField utilitiesField;
    @FXML
    private TextField damagedGoodsField;
    @FXML
    private Label totalExpenseLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        totalExpenseLabel.setText(null);
        // TODO
    }    

    @FXML
    private void updateOnClick(ActionEvent event) {
        double utilities=Double.parseDouble(utilitiesField.getText());
        double damagedGoods=Double.parseDouble(damagedGoodsField.getText());
        double totalExpenses=utilities+damagedGoods;
        
        totalExpenseLabel.setText(Double.toString(totalExpenses));
        
        StoreExpense se= new StoreExpense(
                                       utilities,
                                       damagedGoods,
                                       totalExpenses                  
                            );

                       utilitiesField.setText(null);    
                       damagedGoodsField.setText(null);  
                       Alert a= new Alert(Alert.AlertType.NONE);
                       
try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StoreExpenses.bin"));
            oos.writeObject(se);
            oos.close();
            //messageArea.setText(null);
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            a.setAlertType(Alert.AlertType.CONFIRMATION);
            a.setContentText("Updated");
            a.showAndWait(); 
        }   
    }
    

