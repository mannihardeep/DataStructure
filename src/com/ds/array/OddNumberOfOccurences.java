package com.ds.array;

public class OddNumberOfOccurences {
	 void findOcc(int a[]) {
		 int num=0;
		 for (int i=0;i<a.length;i++) {
			 num ^=a[i];		 
		 }
		 System.out.println("Odd occuring Number : "+num);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 2, 3, 1, 3};
		OddNumberOfOccurences obj = new OddNumberOfOccurences();
		obj.findOcc(a);
	}

}
