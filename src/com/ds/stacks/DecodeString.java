package com.ds.stacks;

import java.util.Stack;

public class DecodeString {
	void DecodeGivenString(String str) {
		Stack <Character> s= new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=']') {
				s.push(str.charAt(i));
			}
			else {
				String temp = "";
				//String calc = "";
				while(s.peek()!='[') {
					temp=temp + s.pop();
				}
				s.pop();
				System.out.println(temp +s.peek());
				int times= Character.getNumericValue(s.pop());
				while(times >1) {
					temp+=temp;
					times--;
				}
				System.out.println(temp+ times);
				for(int j=temp.length()-1;j>=0;j--) {
					s.push(temp.charAt(j));
				}
				System.out.println(s);
			}
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeString obj= new DecodeString();
		String str="3[b2[ca]]";
		String str2= "2[ab]";
		obj.DecodeGivenString(str);
	}

}
