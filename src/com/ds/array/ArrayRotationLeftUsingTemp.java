package com.ds.array;

public class ArrayRotationLeftUsingTemp {
	int a[]= {1,2,3,4,5,6};
	void print() {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	void rotateLeft(int numberOfTimes) {
		for(int i=0;i<numberOfTimes;i++) {
			rotate();
		}
	}
	
	void rotate() {
		int i;
		int temp=a[0];
		for(i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[i]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotationLeftUsingTemp obj= new ArrayRotationLeftUsingTemp();
		obj.print();
		obj.rotateLeft(2);
		System.out.println();
		obj.print();
	}

}
