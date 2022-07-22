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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafxapplication1.Model.Sale;


/**
 * FXML Controller class
 *
 * @author Reza
 */
public class AdminSalesController implements Initializable {


    @FXML
    private Label itemsSoldLabel;
    @FXML
    private Label productIdLabel;
    @FXML
    private Label totalSalesLabel;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                        ObjectInputStream ois=null;

                        Sale s=new Sale();
                        s = null;
         
                        try {
            
            ois = new ObjectInputStream(new FileInputStream("Sales.bin"));
           
            s = (Sale) ois.readObject();
         
            productIdLabel.setText(Integer.toString(s.getSProductId()));
            itemsSoldLabel.setText(Integer.toString(s.getNoOfItemSold()));
            totalSalesLabel.setText(Double.toString(s.getSales()));
            
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
                        
    
}

}

