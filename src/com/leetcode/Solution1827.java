package com.leetcode;

public class Solution1827 
{
	public static int minOperations(int[] nums) 
    {
        int last = nums[0];
        int counter = 0;
        for(int i=1;i<nums.length;i++)
        {
        	if(nums[i] > last)
        	{
        		last = nums[i];
        	}
        	else
        	{
        		counter += last + 1 - nums[i];
        		last += 1;
        	}
        }
        return counter;
    }
	public static void main(String[] args)	
	{
		int[] nums = {1,1,1};
		System.out.println(minOperations(nums));		
	}
}
