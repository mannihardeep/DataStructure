package com.ds.tree.levelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderUsingQueueAndStack {
	static class Node{
		Node left,right;
		int data;
		Node(int d){
			this.data=d;
			this.left=this.right=null;
		}
	}
	Node root;
	
	void printReverseLevelOrder(Node root) {
		Queue<Node> q= new LinkedList<Node>();
		Stack<Node> s= new Stack<Node>();
		
		q.add(root);
		while(!q.isEmpty()) {
			Node tempNode= q.poll();
			s.push(tempNode);
			if(tempNode.right!=null)
				q.add(tempNode.right);
			if(tempNode.left!=null)
				q.add(tempNode.left);
		}
		
		while(!s.isEmpty())
			System.out.print(s.pop().data+" ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLevelOrderUsingQueueAndStack obj= new ReverseLevelOrderUsingQueueAndStack();
		obj.root= new Node(1);
		obj.root.left= new Node(2);
		obj.root.right= new Node(3);
		obj.root.left.left= new Node(4);
		obj.root.left.right= new Node(5);
		obj.root.right.left= new Node(6);
		obj.root.right.right= new Node(7);
		obj.printReverseLevelOrder(obj.root);
	}

}
