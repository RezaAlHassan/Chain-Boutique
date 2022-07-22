/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.File;
import java.io.FileInputStream;
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
import javafxapplication1.Model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafxapplication1.Model.StoreStaff;


/**
 * FXML Controller class
 *
 * @author Reza
 */
public class RMProductController implements Initializable {


    @FXML
    private TextField productNameTextField;
    @FXML
    private TextField productCategoryTextfield;
    @FXML
    private TextField productPriceTextField;
    
    @FXML
    private TableColumn<Product,String> proID;
    @FXML
    private TableColumn<Product,String> proName;
    @FXML
    private TableColumn<Product,String> proCategory;
    @FXML
    private TableColumn<Product,String> proPrice;
    @FXML
    private TableView<Product> allProView;
    private int aNumber = 1;
    
    
    
    //ObservableList<Product> myData = FXCollecctions.observableArraylist();
      //  public ObservableList<Product> getProduct(){
        ObservableList<Product> product = FXCollections.observableArrayList();
      //  product.add(new Product(aNumber++, "Blue Jeans", "Jeans", 20));
        //return product;
    //} 

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
        
    
        //private ArrayList<Product> productArr = new ArrayList<Product>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        proID.setCellValueFactory(new PropertyValueFactory<Product,String>("productId"));
        proName.setCellValueFactory(new PropertyValueFactory<Product,String>("productName"));
        proCategory.setCellValueFactory(new PropertyValueFactory<Product,String>("productCategory"));
        proPrice.setCellValueFactory(new PropertyValueFactory<Product,String>("productPrice"));
        
    }     


    @FXML
    private void add(ActionEvent event) {
        
        
                            Product p= new Product(
                                       aNumber++,
                                       productNameTextField.getText(),
                                       productCategoryTextfield.getText(),
                                       Double.parseDouble(productPriceTextField.getText())
                            );

                       productNameTextField.setText(null);    
                       productCategoryTextfield.setText(null);  
                       productPriceTextField.setText(null);  
                      
                       allProView.getItems().add(p);//set items can take arraylist as argument
                       //newProduct.viewProduct();//shows console output
                     
                       
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("productsDB.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
             oos.writeObject(p);
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
    private void deleteOnClickButton(ActionEvent event) {
        allProView.getItems().removeAll(allProView.getSelectionModel().getSelectedItem());
    }


   // }

    @FXML
    private void load(ActionEvent event)  {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("productsDB.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Product p;
            try{
             
                while(true){
                    p = (Product)ois.readObject();

                    allProView.getItems().add(p);
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
}
