package com.ds.tree.levelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
// use two queue and insert in odd even pattern
public class InlineprintingUsingTwoQueues {
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
		Queue <Node> q1 = new LinkedList<Node>();
		Queue <Node> q2 = new LinkedList<Node>();
		
		q1.add(root);
		while(!q1.isEmpty() || !q2.isEmpty()) {
			while(!q1.isEmpty()) {
				Node tempNode=q1.poll();
				System.out.print(tempNode.data+" ");
				if(tempNode.left!=null)
					q2.add(tempNode.left);
				if(tempNode.right!=null)
					q2.add(tempNode.right);
			}
			System.out.println();
			while(!q2.isEmpty()) {
				Node tempNode=q2.poll();
				System.out.print(tempNode.data+" ");
				if(tempNode.left!=null)
					q1.add(tempNode.left);
				if(tempNode.right!=null)
					q1.add(tempNode.right);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		InlineprintingUsingTwoQueues obj = new InlineprintingUsingTwoQueues();
		obj.root= new Node(1);
		obj.root.left= new Node(2);
		obj.root.right= new Node(3);
		obj.root.left.left= new Node(4);
		obj.root.left.right= new Node(5);
		obj.root.right.left= new Node(6);
		obj.root.right.right= new Node(7);
		obj.printLevelOrder(obj.root);
	}
}
