/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.Model;

import java.io.Serializable;

/**
 *
 * @author Reza
 */
public class Sale implements Serializable{
    private static final long serialVersionUID = -84119231947606113L;
    
    private int noOfItemsSold;
    private double sales;
    private int sProductId;
    
   public Sale(int sProductId,int noOfItemsSold, double sales){
       this.sProductId=sProductId;
       this.noOfItemsSold=noOfItemsSold;
       this.sales=sProductId;
   }
   
      public Sale(){

   }
   
   public void setSProductId(int sProductId){
       this.sProductId=sProductId;
   }
   
    public int getSProductId(){
       return sProductId;
   } 
     
   public void setNoOfItemSold(int noOfItemsSold){
       this.noOfItemsSold=noOfItemsSold;
   }
   
   public int getNoOfItemSold() {
       return noOfItemsSold;
    }
   
   public double getSales(){
       return sales;
   } 
    public void setSales(double sales){
       this.sales=sales;
   }    
}
