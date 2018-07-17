package com.baibhav.chicago.Il;

import java.util.Arrays;

public class CharacterDemo {

	public static boolean getString(String str1, String str2) {
		
		
		
		int[] temparray= new int[256];  // Ascii value is asigned a=97 b=98
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		for(char i :ch1){           // starts with b ascii value is 98 so it inserts in 98th position.[[temparray will be like  {0,0,0,0,0,0.......98....0,0,0,}]]
			temparray[i]++;         //This will make b count 2 a 2 i 1  v 3 for this word baibhavvv
			
		}
		for(char i1 :ch2){
			temparray[i1]--;   //
			
		}
		
		for(int x:temparray){
			if(x!=0){
				return false;
				
			}
			
		}
	
		return true;
	

	}
	public static void main (String args[]){
		
		String str1= "baibhavvv";    
		String str2= "vabviahbv";
		System.out.println("The folooing string are anagram? " +getString(str1,str2));
	}

}
