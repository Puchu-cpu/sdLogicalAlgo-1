package com.sd.String;

import java.util.Arrays;

public class Test02_Anagram {

	public static void main(String[] args) {
		String word="Javaanagram";
		String anagram="anagramJava";
    //  System.out.println("The two given words are anagram:"+isGivenStringAnagram(word,anagram));
      System.out.println("The two given words are anagram:"+isAnagramUsingArraySort(word,anagram));
	}
//1st way
	/*
	Using String methods
	Algorithm:
	   1.Pass two Strings word and anagram to method called isAnagramUsingStringMethods()
	   2.Iterate over first String word and get char c from it using charAt() method
	   3.If index of char c is -1 in second String anagram, then two strings are not anagrams
	   4.If index of char c is not equal to -1 in second String anagram, then remove the character from the String anagram.
	   5.If you get empty String in the end, then two Strings are anagrams of each other.
*/
	public static boolean isGivenStringAnagram(String word,String anagram) {
		   if(word.length()!=anagram.length())
			   return false;
		   for(int i=0;i<word.length();i++) {
			   char c=word.charAt(i);
			   int index=anagram.indexOf(c);
			     if(index!=-1)
			    	 anagram=anagram.substring(0,index)+anagram.substring(index+1,anagram.length());
		       else
			       return false;
		   }
		   return (anagram.isEmpty());	
	}
	
	//2nd way
	public static boolean isAnagramUsingArraySort(String word, String anagram) {
		     String sortword=sortChars(word);
		     String sortanagram=sortChars(anagram);
		     
		     return sortword.equals(sortanagram);
	}
   private static String sortChars(String word) {
	   char[] wordArr=word.toLowerCase().toCharArray();
	   Arrays.sort(wordArr);
	   return String.valueOf(wordArr);
   }
   
   //3rd way
   
   
}
