package com.sd.String;

import java.io.*;
import java.util.*;
public class Test06_PalindromeCheck {
	    public static void main(String args[]) throws IOException {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Please enter the String:");
	            String S = sc.nextLine();  
	            System.out.println("Is the given string pallindrome??"+isPlaindrome(S));
	        }
	  
	
	   public static boolean isPlaindrome(String S) {
	        String str=S;
	        String str1="";
	        for(int i=0;i<str.length();i++){
	            str1=str1+str.charAt(i);
	        }
	        if(str.equals(str1))
	          return true;
	          
	        return false;  
	    }
}	

