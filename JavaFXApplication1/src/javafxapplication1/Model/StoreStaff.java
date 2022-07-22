/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.Model ;

import java.io.Serializable;

/**
 *
 * @author Reza
 */
public class StoreStaff extends Staff implements ViewStaff, Serializable{
    
    /**
     *
     * @param staffId
     * @param staffName
     * @param jobType
     * @param salary
     */
    public StoreStaff( int staffId, String staffName, String jobType, int salary){
        super(staffId,staffName,jobType,salary);
     }
             //all getters
     public int getStoreStaffStaffId() {
     return staffId;
  }
     public String getStoreStaffStaffName() {
     return staffName;
  }
     public String getStoreStaffJobType() {
     return jobType;
  }
     public int getStoreStaffSalary() {
     return salary;
  }

     
          //all setters
     public void setStoreStaffId(int staffId) {
     this.staffId=staffId;
  }
     public void setStoreStaffName(String staffName) {
     this.staffName=staffName;
  }
     public void setStoreStaffJobType(String jobType) {
     this.jobType=jobType;
  }
     public void setStoreStaffSalary(int salary) {
     this.salary=salary;
  }

        
        @Override
        public void viewStaff(){
        System.out.println("Id="+staffId+", Name="+staffName+", Job Type="+jobType+" salary="+salary+"");
    }

    
}
