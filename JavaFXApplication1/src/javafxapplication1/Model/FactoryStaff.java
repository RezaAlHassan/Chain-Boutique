/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.Model;

/**
 *
 * @author Reza
 */
public class FactoryStaff extends Staff implements ViewStaff {
    
    
        public FactoryStaff(int staffId, String staffName, String jobType, int salary){
 super(staffId,staffName,jobType,salary);
     }
        
     public int getFactoryStaffId() {
     return staffId;
  }
     public String getFactoryStaffName() {
     return staffName;
  }
     public String getFactoryStaffJobType() {
     return jobType;
  }
     public int getFactoryStaffSalary() {
     return salary ;
  }
     
     public void setFactoryStaffId(int staffId) {
     this.staffId=staffId;
  }
     public void setFactoryStaffName(String staffName) {
     this.staffName=staffName;
  }
     public void setFactorytaffJobType(String jobType) {
     this.jobType=jobType;
  }
     public void setFactoryStaffSalary(int salary) {
     this.salary=salary;
  }
        
        @Override
        public void viewStaff(){
        System.out.println(salary+"Id="+staffId+", Name="+staffName+", Category="+jobType+"");
    }
    
}
