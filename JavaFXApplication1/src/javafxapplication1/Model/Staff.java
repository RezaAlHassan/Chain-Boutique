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
public class Staff implements ViewStaff,Serializable{
    
     protected int staffId;
     protected String staffName;
     protected String jobType;
     protected int salary;

    /**
     *
     * @param staffId
     * @param staffName
     * @param jobType
     * @param salary
     */
        public Staff( int staffId, String staffName, String jobType, int salary){
        this.staffId = staffId;
        this.staffName = staffName;
        this.jobType= jobType;
        this.salary= salary;
     }

     public int getStaffId() {
     return staffId;
  }
     public String getStaffName() {
     return staffName;
  }
     public String getStaffJobType() {
     return jobType;
  }
     public int getSalary() {
     return salary ;
  }
     
     public void setStaffId(int staffId) {
     this.staffId=staffId;
  }
     public void setStaffName(String staffName) {
     this.staffName=staffName;
  }
     public void setStaffJobType(String jobType) {
     this.jobType=jobType;
  }
     public void setStaffSalary(int salary) {
     this.salary=salary;
  }
     @Override
    public void viewStaff(){
        System.out.println(salary+"Id="+staffId+", Name="+staffName+", Category="+jobType+"");
    }
} 

    

