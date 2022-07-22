/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.Model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Reza
 */
public class StoreExpense extends Expense implements Serializable{
       
        public StoreExpense(double utilities, double damagedGoods, double totalExpenses) {
        super( utilities, damagedGoods, totalExpenses);
    }

    public StoreExpense() {
     
    }
    


    public void setStoreUtilities(double utilities) {
        this.utilities = utilities;
    }

    public void setStoreDamagedGoods(double damagedGoods) {
        this.damagedGoods = damagedGoods;
    }

       public void setStoreTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    } 
    

    public double getStoreUtilities() {
  
        return utilities;
    }

    public double getStoreDamagedGoods() {
   
        return damagedGoods;
    }
    
    public double getStoreTotalExpenses() {
        return totalExpenses;
       
    
    }
}
