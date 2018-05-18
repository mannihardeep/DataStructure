package com.ds.stacks;

import java.util.Stack;

public class SortingStack {
	Stack <Integer> original= new Stack<Integer>();
	Stack <Integer> s1= new Stack<Integer>();
	Stack <Integer> s2= new Stack<Integer>();
	void sort() {
		int max=0;
		s1.push(-1);
		System.out.println(original);
		
		
		while(!original.isEmpty()) {
			
			if(original.peek()> max) {
				if(max!=0) {
				 s1.push(max);
				}
				max=original.pop();
				
			}
			else {
				s1.push(original.pop());
			}
			if(original.isEmpty()) {
				//original.push(max);
				System.out.println("original "+ original);
				System.out.println("s1 "+ s1);
				Stack<Integer> temp = s1;
				System.out.println("temp "+ temp);
			}
			
		}
		
		
		System.out.println("original "+ original);
		System.out.println("s1 "+ s1);
		System.out.println("max "+ max);
		System.out.println("s2 "+ s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingStack obj= new SortingStack();
		obj.original.push(9);
		obj.original.push(3);
		obj.original.push(5);
		obj.original.push(18);
		obj.original.push(2);
		obj.sort();
	}
}
