package com.leetcode;

public class Solution2073 {
	public static int timeRequiredToBuy(int[] tickets, int k) 
    {
		int counter = 0;
        while(tickets[k] != 0)
        {
        	for(int i =0 ;i<tickets.length;i++)
        	{
        		if(tickets[k] != 0)
        		{
        			tickets[i] -= 1;
        			counter += 1;
        		}
        		if(i == k && tickets[k] == 0)
                {
                    return counter;
                }
        	}
        }
		return counter;
    }
	public static void main(String[] args)
	{
		int[] tickets = {2,3,2};
		int k = 2;
		System.out.println(timeRequiredToBuy(tickets, k));
	}
}
