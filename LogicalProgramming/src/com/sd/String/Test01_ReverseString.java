package com.sd.String;

import java.util.Scanner;

public class Test01_ReverseString {
     
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//Enter a String
		System.out.println("Enter the string: ");
		String string=scn.nextLine();
       String reverse=reverseString(string);
        System.out.println("The reverse string is "+reverse);
	}

	private static String reverseString(String string) {
		String s1=string;
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		return s2;
		
	}

}
