package com.ds.LL;

public class ReverseLL {
	static Node head;
	static class Node{	
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	Node reverse(Node head) {
		
		Node prev= null, next= null;
		Node curr= head;
		while(curr!=null) {
			next=head.next;
			curr.next=prev;
			prev= curr;
			curr= next;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLL list= new ReverseLL();
		list.head= new Node(1);
		list.head.next= new Node(2);
		list.head.next.next= new Node(3);
		list.head.next.next.next= new Node(4);
		list.print(head);
		Node h=list.reverse(head);
		list.print(h);

	}

}
