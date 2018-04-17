package com.ds.array;

import java.util.HashSet;

public class SuminArrayFirstOcc {
	
	void FirstOcc(int arr[], int sum) {
		HashSet<Integer> s= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(s.contains(sum-arr[i])) {
				System.out.println("Sum pair : "+arr[i]+" , "+ (sum-arr[i]));
				return;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,5,6,8,1,7};
		SuminArrayFirstOcc obj= new SuminArrayFirstOcc();
		obj.FirstOcc(a, 10);
	}

}
