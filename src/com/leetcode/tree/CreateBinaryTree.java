package com.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CreateBinaryTree 
{
	private TreeNode root;
	private class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int data) {
			this.data = data;
		}
		
	}
	
	public void createTree()
	{
		TreeNode first = new TreeNode(3);
		TreeNode second = new TreeNode(7);
		TreeNode third = new TreeNode(8);
		TreeNode fourth = new TreeNode(9);
		TreeNode fifth = new TreeNode(10);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		third.right = fifth;
	}
	
	public void traverseTree()
	{
		Queue<TreeNode> queue = new LinkedList<CreateBinaryTree.TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty())
		{
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null)
			{
				queue.offer(temp.left);
			}
			if(temp.right != null)
			{
				queue.offer(temp.right);
			}
		}
	}
	
	public static void main(String[] args)
	{
		CreateBinaryTree obj = new CreateBinaryTree();
		obj.createTree();
		obj.traverseTree();
	}
}
