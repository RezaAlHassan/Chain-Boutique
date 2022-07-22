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
public class Expense implements Serializable {
     
     protected double utilities;
     protected double damagedGoods;
     protected double totalExpenses;
     private static final long serialVersionUID = -2990472013223964679L;
     
       public Expense( double utilities, double damagedGoods, double totalExpenses) {
        //this.dateValidation= dateValidation;
        this.utilities = utilities;
        this.damagedGoods = damagedGoods;
        this.totalExpenses = totalExpenses;
    }
              public Expense( ) {
        //this.dateValidation= dateValidation;
    }


    public void setUtilities(double utilities) {
        this.utilities = utilities;
    }

    public void setDamagedGoods(double damagedGoods) {
        this.damagedGoods = damagedGoods;
    }

       public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    } 
    
    public double getUtilities() {
        //return firstName;
        return utilities;
    }

    public double getDamagedGoods() {
        //return firstName;
        return damagedGoods;
    }
    
    public double getTotalExpenses() {
        //return firstName;
        return totalExpenses;
    }
}
