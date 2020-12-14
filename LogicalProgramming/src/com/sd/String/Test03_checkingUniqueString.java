package com.sd.String;

import java.util.HashSet;
import java.util.Scanner;

public class Test03_checkingUniqueString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String::");
        String str=sc.nextLine();
        
        System.out.println("Is the given String has contain all unique character ? ==>"+hasUniqueChar(str));
	}

	public static boolean hasUniqueChar(String word) {
		     
		/*        HashSet alphaset=new HashSet();
		        for(int i=0;i<word.length();i++) {
		        char c=word.charAt(i);
		        if(!alphaset.add(c))
		        	return false;
		        }
		        */
		for(int i=0;i<word.length();i++) {
	        char c=word.charAt(i);
	        if(word.indexOf(c)!=word.lastIndexOf(c))
	        	return false;
		}
		return true;
	}

}
