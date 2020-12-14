package com.nt.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindChildTag {

	public static void main(String[] args) throws IOException {
		
		String inputHtmltag=new String(Files.readAllBytes(Paths.get("htmlFile.txt")));
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter 1 to find tag by Line Number or 2 to find tag by TagName ::");
        int userIn=scn.nextInt();
        
        switch(userIn) {
        case 1:
        	System.out.println("Enter the Line Number::");
        	int lineNum=scn.nextInt();
        	findChildTagByUsingLineNumber(inputHtmltag,lineNum);
        	break;
        case 2:
        	System.out.println("Enter the tag name::");
        	scn.nextLine();
        	String tagName=scn.nextLine();
        	findChildTagByUsingTagName(inputHtmltag,tagName);
        	break;
        default:
        	System.out.println("Invalid option,Please Enter correct option.");  	
        }
	}


	public static void findChildTagByUsingLineNumber(String inputHtmltag, int lineNum) {
		String[] allEle=inputHtmltag.split(">");
		List<String> al =  Arrays.asList(allEle);
		 String tagName = al.get(lineNum - 1);
	
		 if (!tagName.startsWith("</")) {
		findChildTagByUsingTagName(inputHtmltag,tagName);
		
		}
		else {
			System.out.println("Wrong Input");
		}
	}
	
public static void findChildTagByUsingTagName(String inputHtmltag, String tagName) {
		
		ArrayList<String> childTagList = new ArrayList<String>();
		
		tagName = replaceAllSpecialChar(tagName);
		String[] allEle=inputHtmltag.split(">");
		
		 
		 List<String> alSplitEle =Arrays.asList(allEle);
		 
		 ArrayList<String> allHtmlElements = new ArrayList<>();
		 
	        for (String el : alSplitEle) {
	            allHtmlElements.add(el.trim() + ">");
	        }
	       
	        
		 String startTag="<"+tagName+">";
		 String endTag="</"+tagName+">";
		 
		 
		 if(allHtmlElements.contains(startTag) && allHtmlElements.contains(endTag) ) {
			 List<String> allSubEle=allHtmlElements.subList(allHtmlElements.indexOf(startTag), allHtmlElements.indexOf(endTag)+1);
			 if(allSubEle.size() > 2) {
				 int childStartIndex=1;
				 String childTagName=allSubEle.get(childStartIndex);
				 String childName= replaceAllSpecialChar(childTagName);
				
				 while(!endTag.contains(childName)) {
					 if(!childTagList.contains(childName)) {
						 childTagList.add(childName);
						 
					 }
					 if(childTagName.equals("<"+childName+"/>")) {
						 childStartIndex=allSubEle.indexOf(childTagName)+1;
						 
					 }
					 else if(allSubEle.contains("</"+childName+">")) {
						 childStartIndex=allSubEle.indexOf("</"+childName+">")+1;
						
					 }
					 childTagName=allSubEle.get(childStartIndex);
					 childName= replaceAllSpecialChar(childTagName); 
				 }
			 }
			 else {
				 System.out.println(tagName+" has no child tag");
			 }
		 }
		 else {
			 System.out.println(tagName+" is incorrect tag");
		 }
		 
		 System.out.println("Output: " + childTagList);
	}

	private static String replaceAllSpecialChar(String str) {
		
		return str.replace("<", "")
				          .replace(">", "")
				          .replace("/", "")
				          .trim();
	}

}
