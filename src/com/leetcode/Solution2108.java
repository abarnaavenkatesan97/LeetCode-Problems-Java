package com.leetcode;

public class Solution2108 {
	public static String firstPalindrome(String[] words) 
    {
        for(String word : words)
        {
        	int i = 0, j = word.length()-1;
        	boolean found = true;
        	while(j > 0)
        	{
        		if(word.charAt(i) != word.charAt(j))
        		{
        			found = false;
        			break;
        		}
        		i += 1;
        		j -= 1;
        	}
        	if(found)
        	{
        		return word;
        	}
        }
        return "";
    }
	public static void main(String[] args)
	{
		String[] words = {"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(words));
	}
}
