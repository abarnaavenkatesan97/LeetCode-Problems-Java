package com.leetcode;

public class Solution2239 {
	public static int findClosestNumber(int[] nums) 
    {
        int closestDist = Math.abs(nums[0]);
        int closest = nums[0];
        int dist = 0;
        for(int i=1;i < nums.length;i++)
        {
        	dist = Math.abs(nums[i]);
        	if(dist < closestDist)
        	{
        		closest = nums[i];
        		closestDist = dist;
        	}
        	else if(dist == closestDist)
        	{
        		if(nums[i] > closest)
        		{
        			closest = nums[i];
        		}
        	}
        }
        return closest;
    }
	public static void main(String[] args)
	{
		int[] nums = {-4,-2,1,4,8};
		System.out.println(findClosestNumber(nums));
	}

}
