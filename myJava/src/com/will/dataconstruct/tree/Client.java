package com.will.dataconstruct.tree;

public class Client {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		int[] arr = {8, 3, 1, 2, 4, 10, 21, 43};
		for(int i : arr){
			binaryTree.insert(i);
		}
		binaryTree.display();
		
		Node node = binaryTree.find(3);
		if(node != null){
			node.display();
		} else {
			System.out.println("i can't find it in this biTree!!!");
		}
	}
}
