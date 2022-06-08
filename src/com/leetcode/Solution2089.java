package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution2089 
{
	public static List<Integer> targetIndices(int[] nums, int target)
	{
        int counter = 0;
        int found = 0;
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
        	if(nums[i] < target)
        	{
        		counter += 1;
        	}
        	else if(target == nums[i])
        	{
        		found += 1;
        	}
        }
        if(found == 0)
        {
        	return result;
        }
        else
        {
        	for(int j=counter;j < found + counter;j++)
        	{
        		result.add(j);
        	}
        }
        return result;
    }
	public static void main(String[] args)
	{
		int[] nums = {1,2,5,2,3};
		int target = 2;
		System.out.println(targetIndices(nums,target));
		
	}
}
