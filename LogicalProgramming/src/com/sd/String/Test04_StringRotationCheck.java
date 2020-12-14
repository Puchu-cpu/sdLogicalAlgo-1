package com.sd.String;

import java.util.Scanner;

public class Test04_StringRotationCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String::");
		String word=sc.nextLine();
		System.out.println("Enter the Second String::");
		String rotation=sc.nextLine();
		
		System.out.println("Is the Second String is rotation of first string??==>"+isRotate(word,rotation));

	}

	public static boolean isRotate(String word, String rotation) {
		String str=word+word;
		if(str.contains(rotation))
			return true;
		return false;
	}

}
