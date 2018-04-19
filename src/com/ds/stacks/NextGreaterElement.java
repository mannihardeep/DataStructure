package com.ds.stacks;

import java.util.Stack;

public class NextGreaterElement {
	void PrintNextGreater(int arr[]) {
		Stack <Integer> s= new Stack<Integer>();
		s.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			while(s.peek()< arr[i]) {
				System.out.println(s.pop() +" "+ arr[i]);
				if(s.isEmpty()) {
					s.push(arr[i]);
					break;
				}
				if(s.peek()>arr[i]) {
					s.push(arr[i]);
				}
			}
			if(arr[i]<s.peek()) {
				s.push(arr[i]);
			}
			
				//System.out.println(s);
			
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop() +" "+ "-1");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,5,25};
		 int arr2[] = { 11, 13, 21, 3 };
		NextGreaterElement obj= new NextGreaterElement();
		obj.PrintNextGreater(arr);
		obj.PrintNextGreater(arr2);

	}

}
