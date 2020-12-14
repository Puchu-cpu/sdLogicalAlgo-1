package com.nt.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClaculateAge {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your DOB::");
       String dt=sc.nextLine();
       
       Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(dt);
       //System.out.println(d1);
    System.out.println("Your age is::"+calAge(d1));
       
       
       
	}

	public static int  calAge(Date d1) {
		 Date d=new Date();
	      // System.out.println(d);
		long age=d.getYear()-d1.getYear();
return (int) age;
	}

}
