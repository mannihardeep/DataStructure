package com.ds.array;

public class MissingElementInrange {
	void missing(int arr[], int range) {
		int x1=0,x2=0;
		for(int i=0;i<arr.length;i++) {
			x1=x1 ^ arr[i];
		}
		for(int i=1;i<=range;i++) {
			x2=x2 ^ i;
		}
		System.out.println("Missing number "+ (x1 ^ x2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 4, 6, 3, 7, 8};
		MissingElementInrange obj = new MissingElementInrange();
		obj.missing(a,8);
	}

}
