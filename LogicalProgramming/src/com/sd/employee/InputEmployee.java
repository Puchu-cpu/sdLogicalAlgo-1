package com.sd.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class InputEmployee {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Collection<Collection> coc=new ArrayList<>();
		int count=0;
		String option="N";
		EmployeeData e;
		Company com=new Company();
		do {
			ArrayList<Object> al=new ArrayList<Object>();
			System.out.println("Enter employee"+ ++count+"Details");
			e=new EmployeeData();
			
			System.out.println("Enter Employee id:");
			e.setId(scn.nextInt());scn.nextLine();
			System.out.println("Enter Employee name:");
			e.setName(scn.nextLine());
			System.out.println("Enter Employee age:");
			e.setAge(scn.nextInt());
			System.out.println("Enter Employee salary:");
			e.setSalary(scn.nextDouble()); scn.nextLine();
			
			com.join(e);
			System.out.println("Employee join the cmpany");
			
			System.out.println("Do you want to continue?(Y/N)");
			option=scn.nextLine();
		}while(option.equalsIgnoreCase("Y"));
		com.display();
	//	 Collections.sort(coc,com.compare( , b)); 
		  
	        System.out.println("\nSorted by rollno"); 
	//        for (int i=0; i<al.size(); i++) 
//	            System.out.println(al.get(i)); 
	}

}
