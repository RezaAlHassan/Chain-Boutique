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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafxapplication1.Model.FactoryExpense;
import javafxapplication1.Model.Sale;
import javafxapplication1.Model.StoreExpense;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class AdminExpensesController implements Initializable {

    @FXML
    private PieChart chart;
    @FXML
    private ComboBox comboBox;
    private double utilities;
    private double damagedGoods;
    private double totExpense;
    @FXML
    private Label utilitiesLabel;
    @FXML
    private Label dgLabel;
    @FXML
    private Label teLabel;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("Store","Factory");
        comboBox.setValue("Factory"); 
        utilitiesLabel.setText(null);
        dgLabel.setText(null);
        teLabel.setText(null);
        // TODO
    }    

    @FXML
    private void generateOnClick(ActionEvent event) {
        if(comboBox.getValue()=="Factory"){
                        ObjectInputStream ois=null;

                        FactoryExpense fe=new FactoryExpense();
                        fe = null;
         
                        try {
            
            ois = new ObjectInputStream(new FileInputStream("FactoryExpenses.bin"));
           
            fe = (FactoryExpense) ois.readObject();
         
            utilities=fe.getFactoryUtilities();
            damagedGoods=fe.getFactoryDamagedGoods();
            totExpense=fe.getFactoryTotalExpenses();
            //totalSalesLabel.setText(Double.toString(s.getSales()));
            utilitiesLabel.setText(Double.toString(utilities));
            dgLabel.setText(Double.toString(damagedGoods));
            teLabel.setText(Double.toString(totExpense));
            
            
        } catch (IOException ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();             
    }   catch (ClassNotFoundException ex) {  
            Logger.getLogger(AdminSalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
              ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Utilities", utilities),
                new PieChart.Data("DamagedGoods", damagedGoods));
              chart.setData(pieChartData);
              
        }
              //loads store Expenses
              if(comboBox.getValue()=="Store"){
                      ObjectInputStream ois=null;

                        StoreExpense se=new StoreExpense();
                        se = null;
         
                        try {
            
            ois = new ObjectInputStream(new FileInputStream("StoreExpenses.bin"));
           
            se = (StoreExpense) ois.readObject();
         
            utilities=se.getStoreUtilities();
            damagedGoods=se.getStoreDamagedGoods();
            totExpense=se.getStoreTotalExpenses();
            //totalSalesLabel.setText(Double.toString(s.getSales()));
            utilitiesLabel.setText(Double.toString(utilities));
            dgLabel.setText(Double.toString(damagedGoods));
            teLabel.setText(Double.toString(totExpense));
            
            
        } catch (IOException ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();             
    }   catch (ClassNotFoundException ex) {  
            Logger.getLogger(AdminSalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
              ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Utilities", utilities),
                new PieChart.Data("DamagedGoods", damagedGoods));
              chart.setData(pieChartData);
                  
              }
    
}
              
    }
  
        
    
    

