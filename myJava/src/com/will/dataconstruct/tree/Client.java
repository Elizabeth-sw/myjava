package com.will.dataconstruct.tree;

public class Client {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(2);
		binaryTree.insert(8);
		binaryTree.insert(1);
		binaryTree.display();
		
		Node node = binaryTree.find(3);
		if(node != null){
			node.display();
		} else {
			System.out.println("i can't find it in this biTree!!!");
		}
	}
}
