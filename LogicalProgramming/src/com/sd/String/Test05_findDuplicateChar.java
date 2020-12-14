package com.sd.String;

import java.util.HashMap;
import java.util.Set;
 
public class Test05_findDuplicateChar {
 
 public static void main(String[] args) {
  String str = "java2blog.com ";
  HashMap charCountMap = new HashMap();
  for (int i = 0; i < str.length(); i++) {
   char c = str.charAt(i);
 
   if (charCountMap.containsKey(c)) {
//    charCountMap.put(c, charCountMap.get(c) + 1);
   } else {
    charCountMap.put(c, 1);
   }
 
  }
  //for (Character c : charCountMap.keySet()) {
 //  if (charCountMap.get(c) > 1)
   // System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));
 
  }
 
 }
 
//}