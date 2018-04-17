package com.ds.array;

import java.util.HashSet;

public class FindSumInArray {
	HashSet<Integer> set=new HashSet<Integer>();
	void FindSumUsingHashset(int arr[],int sum) {
		for(int i=0;i<arr.length;i++) {
			int temp= sum-arr[i];
			if(temp>0 && set.contains(temp)) {
				System.out.println(sum +" formed using "+ arr[i]+ " , "+ temp);
				return;
			}
			set.add(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,5,6,8,1,7};
		FindSumInArray obj= new FindSumInArray();
		obj.FindSumUsingHashset(a, 10);
	}

}
