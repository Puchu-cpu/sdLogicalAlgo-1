package com.sd.employee;

import java.util.Comparator;
import java.util.LinkedHashSet;

public class Company  implements Comparator<EmployeeData> {
       private LinkedHashSet<EmployeeData> employeeSet;
       
       public Company() {
    	   employeeSet=new LinkedHashSet<>();
       }
       
       public boolean join(EmployeeData e) {
    	   return this.employeeSet.add(e);
       }
       public boolean find(EmployeeData e) {
    	   return this.employeeSet.contains(e);
       }
       public EmployeeData getEmployee(EmployeeData e) {
    	   
    	   for(EmployeeData ele:employeeSet ) {
    		   if(e.equals(ele)) {
    			   return e;
    		   }
    	   }
		return null;
    	   
       }
       public int compare(EmployeeData a, EmployeeData b) 
       { 
       	if(a.getSalary()!=b.getSalary())
                return (int) (a.getSalary() - b.getSalary());
       	else
       		return a.getAge()-b.getAge(); 
       }
       public void display() {
    	   for(EmployeeData e:employeeSet) {
    		   System.out.println(e);
    	   }
       }
}
 
	 
   

  
