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
public class FactoryExpense extends Expense implements Serializable{
    private static final long serialVersionUID =-1434904793342334399L;
        public FactoryExpense( double utilities, double damagedGoods, double totalExpenses) {
        super(utilities, damagedGoods,  totalExpenses);
    }
        
        public FactoryExpense( ){}
    

    public void setFactoryUtilities(double utilities) {
        this.utilities = utilities;
    }

    public void setFactoryDamagedGoods(double damagedGoods) {
        this.damagedGoods = damagedGoods;
    }

       public void setFactoryTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    } 
    

    public double getFactoryUtilities() {
  
        return utilities;
    }

    public double getFactoryDamagedGoods() {
   
        return damagedGoods;
    }
    
    public double getFactoryTotalExpenses() {
        return totalExpenses;
       
    
    }
}
