package com.ds.tree.levelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {
	Node root;
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			this.data=d;
			this.left=null;
			this.right=null;
		}
	}
	
	void printLevelOrder(Node root) {
		Queue <Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node tempNode=q.poll();
			System.out.print(tempNode.data+" ");
			if(tempNode.left!=null)
				q.add(tempNode.left);
			if(tempNode.right!=null)
				q.add(tempNode.right);
		}
		
	}
	
	public static void main(String args[]) {
		UsingQueue obj = new UsingQueue();
		obj.root= new Node(1);
		obj.root.left= new Node(2);
		obj.root.right= new Node(3);
		obj.root.left.left= new Node(4);
		obj.root.left.right= new Node(5);
		obj.printLevelOrder(obj.root);
	}
}
