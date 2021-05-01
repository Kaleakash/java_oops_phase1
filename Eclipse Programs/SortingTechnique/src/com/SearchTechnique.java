package com;

import java.io.File;
import java.util.Arrays;

public class SearchTechnique {

	public static int linearSearch(int arr[],int x) {
		//File ff = new File("Path");
		//String listOfFile[] = ff.list();
		//String str = "Ravi";
		//str.equalsIgnoreCase("ravi");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int arr[],int first, int last, int key) {
				int mid = (first+last)/2;			
				while(first<=last) {	
					if(arr[mid]<key) {
							first = mid+1;
						}else if(arr[mid]==key) {
							return mid;
						}else {
							last = mid-1;
						}
						mid = (first+last)/2;
				}
						if(first>last) {
							return -1;
						}else {
							return 0;
						}
	}
	public static void main(String[] args) {
		int num[]= {3,4,1,6,8,9,2};
		int n = 2;
		//int result = linearSearch(num, n);
		Arrays.sort(num);				// pre-defined sorting 
		int result = binarySearch(num, 0, num.length-1, n);
		if(result>0) {
			System.out.println("Element found in position "+result+" "+"Value is "+n);
		}else {
			System.out.println("Element is not present ");
		}
	}

}
