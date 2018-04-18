package com.ds.stacks;

import java.util.Stack;

public class BodmasOperation {
	void calculate(String str) {
		Stack<String> s= new Stack<String>();
		for(int i=0;i<str.length();i++) {
			String temp= str.substring(i, i+1);
			if(!temp.equals(")")) {
				s.push(temp);
				System.out.print(temp);
				System.out.println("new stack "+s);
				
				
			}
			else {
				System.out.println("new stack "+s);
				int result=0;
				String res = "";
				while( !s.peek().equals("(")) {
					int val1 =Integer.parseInt(s.pop());
					String op=s.pop();
					int val2 =Integer.parseInt(s.pop());
					result= operator(op,val1,val2);
					res = result+"";
					System.out.println("new res"+val1 +" "+ op +"  "+val2 +" "+ result +" res "+ res);
					    System.out.println(" peek now"+s.peek());
					    System.out.println("char result " + (result + ""));
					    //System.out.println("opera "+Character.toString(s.pop()));
					}
				System.out.println("final new stack "+s);
				s.pop();
				s.push(res);
				System.out.println("final new stack "+s);
					//result= result + s.pop();
					//System.out.println(" peek "+s.peek());
					
					
					System.out.println("new stack "+s);
				//}
				//System.out.println("result "+result);
			}
		}
	}
	
	int operator(String op, int val1, int val2) {
		switch(op) {
		case "+": return val1 + val2;
		case "-": return val2 - val1;
		case "*": return val1 * val2;
		case "/": return val2 / val1;
		
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(((3+(5*(6+2)))*(6-2))/4)";
		BodmasOperation obj= new BodmasOperation();
		obj.calculate(str);
	}

}
