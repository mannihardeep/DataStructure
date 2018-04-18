package com.ds.array;
//An element is leader if it is greater than all the elements to its right side.
//And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, 
//leaders are 17, 5 and 2.*/
public class LeaderElement {
	void findLeader(int a[]) {
		int max=0;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>max) {
				max=a[i];
				System.out.print(max +" ");
			}
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
		LeaderElement obj = new LeaderElement();
		obj.findLeader(arr);
	}

}
