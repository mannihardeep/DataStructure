package com.ds.array;

import java.util.HashMap;

public class MajorityElement {
	//A majority element in an array A[] of size n is an element that appears more than n/2 times
	//(and hence there is at most one such element).
	void checkMajority(int arr[]) {
		HashMap <Integer, Integer> m= new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(m.containsKey(arr[i])) {// this will work when key exists and we need to write the first case
				int count= m.get(arr[i])+1;
				if(count>arr.length/2) {
					System.out.println("Majority element found : "+arr[i]);
					return;
				}
				else {
					m.put(arr[i], count);
				}
			}
		else {
			m.put(arr[i], 1); //intial case for every unique key
		}
		}
		System.out.println("No Majority");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int b[]={3, 3, 4, 2, 4, 4, 2, 4};
		MajorityElement obj= new MajorityElement();
		obj.checkMajority(a);
		obj.checkMajority(b);
	}

}
