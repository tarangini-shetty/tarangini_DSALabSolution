package com.greatlearning.lab2.driver;

import java.util.Scanner;

import com.greatlearning.lab2.binarysearch.binarySearchTree;

public class driver {

	public static void main(String[] args) {
		binarySearchTree bst = new binarySearchTree();
		bst.insert(40).insert(20).insert(60).insert(10).insert(30).insert(50).insert(70);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sum:");
		int sum = sc.nextInt();
		bst.printSumPair(sum);
	}

}
