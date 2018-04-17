package com.ds.array;

public class ArrayRotationUsingReversalAlgorithm {
	int a[]= {1,2,3,4,5,6,7};
	
	void print() {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	void rotateUsingReversalAlgo(int d) {
		rotate(a,0,d-1);
		rotate(a,d,a.length-1);
		rotate(a,0,a.length-1);
	}
	void rotate(int arr[],int start, int end) {
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotationUsingReversalAlgorithm obj= new ArrayRotationUsingReversalAlgorithm();
		obj.print();
		obj.rotateUsingReversalAlgo(5);
		System.out.println();
		obj.print();
	}
}
