package com.greatlearning.lab2.binarysearch;

import java.util.HashSet;
import java.util.Set;

public class binarySearchTree {
	private Node root;
	public static class Node {
		private int nodeData;
		private Node left;
		private Node right;
		public Node(int nodeData)
		{
			this.nodeData = nodeData;
		}
	}
	public binarySearchTree insert(int data) {
		if (root == null) {
			root = new Node(data);
			//return root;
		}
		insert(root,data);
		return this;
	}
	private Node insert(Node node, int data) {
		if(node == null)
		{
			node = new Node(data);
			return node;
		}
		if(data < node.nodeData)
		{
			node.left = insert(node.left, data);
			return node;
		}
		if(data > node.nodeData)
		{
			node.right = insert(node.right, data);
			
		}
		return node;
	}
	public void printSumPair(int sum)
	{
		if(!printSumPair(root,sum,new HashSet<>()))
		{
			System.out.println("no pair found");
		}
	}
	private boolean printSumPair(Node node, int sum, Set<Integer> set)
	{
		if (node == null)
		{
			return false;
		}
		if (printSumPair(node.left, sum, set))
		{
			return true;
		}
		if (set.contains(sum - node.nodeData))
		{
			System.out.println("Pair is found (" + (sum - node.nodeData) +","+node.nodeData+")");
			return true;
		}
		else
		{
			set.add(node.nodeData);
		}
		return printSumPair(node.right, sum, set);
	}

}
