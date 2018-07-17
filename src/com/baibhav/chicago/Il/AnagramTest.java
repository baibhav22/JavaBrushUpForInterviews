package com.baibhav.chicago.Il;

public class AnagramTest {

	public static void main(String[] args) {
		String str1="baibhav";
		String str2="abihboa";
		System.out.println("The two string are anagram??" +isAnagram(str1,str2));
		
		

	}
	public static boolean isAnagram(String a, String b){
	    //assume that we are using ASCII
	    int[] charCnt = new int[256];
	    for(int i = 0; i < a.length(); i++){
	     charCnt[a.charAt(i)]++;
      	    }
	    for(int i = 0; i< b.length(); i++){
	        charCnt[b.charAt(i)]--;
	    }
	    for(int i = 0; i<charCnt.length; i++){
	        if(charCnt[i] != 0) return false;
	    }
	    return true;
	}

}
