package com.will.dataconstruct.tree;

public class BinaryTree {
	
	private Node root;
	
	public void insert(int value){
		Node node = this.nodeInstance(value);
		Node parent = null;
		if(root == null){
			root = node;
			parent = root;
		} else {
			parent = this.save(node, root);
		}
		
		if(parent == null){
			System.out.println("the value is not unique");
		}
	}
	
	public Node find(int value){
		if(root == null){
			System.out.println("the biTree is empty!");
			return null;
		}
		
		if(root.value == value){
			return root;
		} else {
			return this.find(root, value);
		}
	}
	
	private Node find(Node node, int value){
		if(node == null){
			return null;
		}
		
		if(node.left != null){
			return node.left.value == value ? node.left : this.find(node.left, value);
		}
		
		if(node.right != null){
			return node.right.value == value ? node.right : this.find(node.right, value);
		}
		
		return null;
	}
	
	public void display(){
		System.out.println(root.value);
		Node[] nextNodeArr = new Node[2];
		nextNodeArr[0] = root.left;
		nextNodeArr[1] = root.right;
		this.display(nextNodeArr, 2);
	}
	
	public void display(Node[] nodeArr, int floor){
		boolean flag = false;
		Node[] nextNodeArr = new Node[2 << (floor - 1)];
		for(int i = 0; i < nodeArr.length; i++){
			if(nodeArr[i] == null){
				System.out.print("_ ");
				nextNodeArr[2 * i] = null;
				nextNodeArr[2 * i + 1] = null;
			} else {
				System.out.print(nodeArr[i].value);
				if(i == nodeArr.length - 1){
					System.out.println();
				} else {
					System.out.print(" ");
				}
				
				if(nodeArr[i].left != null){
					nextNodeArr[2 * i] = nodeArr[i].left;
					flag = true;
				}
				
				if(nodeArr[i].right != null){
					nextNodeArr[2 * i + 1] = nodeArr[i].right;
					flag = true;
				}
			}
		}
		
		if(flag){
			this.display(nextNodeArr, ++floor);
		}
		
	}
	
	public void remove(int value){
		if(root == null){
			System.err.println("this biTree is empty!");
			return;
		}
		
		if(root.value == value){
			root = null;
			return;
		}
		
		
	}
	
	private void remove(Node parent, Node node, int value){
		if(node.value == value){
			if(node.left == null && node.right == null){
				node = null;
				return;
			} 
//			if(){
//				
//			}
		}
	}
	
	private Node save(Node node, Node parent){
		if(node.value > parent.value){
			if(parent.right == null){
				parent.right = node;
				return parent;
			} else {
				return this.save(node, parent.right);
			}
		} else if (node.value < parent.value){
			if(parent.left == null){
				parent.left = node;
				return parent;
			} else {
				return this.save(node, parent.left);
			}
		} else {
			return null;
		}
	}
	
	private Node nodeInstance(int value){
		return new Node(value);
	}
	
}
