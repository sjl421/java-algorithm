package countPalindrome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// To count the number of palindromic substring, we need to traversal all substrings of the string. 
public class Solution {
	static int palindrome(String str) {
	    String[] strArray = str.split("");
	    List<String> list = Arrays.asList(strArray);
	    List<String> palindromeList = new ArrayList<>(list);
	    String palindrome = null;
	    // to traversal all substrings of str.
	    for(int i = 0;i<list.size();i++){
	        palindrome = list.get(i);
	        for(int j = i+1;j<list.size();j++){
	            palindrome = palindrome+list.get(j);
//            	System.out.println(palindrome);
	            if(isPalindrome(palindrome)){
//	            	System.out.println(palindromeStr);
	                palindromeList.add(palindrome);
	            }
	        }
	    }
//    	System.out.println(palindromeList);
	    return palindromeList.size();
	}

	static boolean isPalindrome(String str){
	    int start = 0;
	    int end = str.length()-1;
	    while(start < end) {
	    	if(str.charAt(start) != str.charAt(end)) return false;
	    	start++;
	    	end--;
	    }

	    return true;
	}

	public static void main(String[] args) throws IOException{
	    System.out.println(palindrome("dskjkd"));
	}

}
