package com.nt.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountVowel {

	public static void main(String[] args) throws IOException {
		 
			FileReader reader=new FileReader("sample.txt");
			BufferedReader br=new BufferedReader(reader);
			int counta=0;
			int counte=0;
			int counti=0;
			int counto=0;
			int countu=0;
			while (br.ready()) { 
	            // Read and print characters one by one 
	            // by converting into character 
	        //    System.out.println("Char :"    + (char)br.read()); 
	            if((char)br.read()=='a')
	             counta++;
	            else if((char)br.read()=='e')
	             counte++;
	            else if((char)br.read()=='i')
		             counti++;
	            else if((char)br.read()=='o')
		             counto++;
	            else if((char)br.read()=='u')
		             countu++;   
	        }
			System.out.println("Number of a vowels is"+counta+"\nNumber of e vowels is"+counte+"\nNumber of i vowels is"
	                                                                               +counti+"\nNumber of o vowels is"+counto+"\nNumber of u vowels is"+countu);
	}

}
