package com;

import java.util.Scanner;

public class SortingDemo {
	public static void bubbleSort(int num[]) {
			for(int i=0;i<num.length-1;i++) {							//size is 8,  outer loop iterator 0 to 7
				for(int j=0;j<num.length-1-i;j++) {
					if(num[j]<num[j+1]) {								//5, 3
						int temp = num[j];								// 5 value store in temp 
						num[j]=num[j+1];								// 3 value assing to 0 postion 
						num[j+1]=temp;									//5 value assing to 1 postion 
					}
				}
			}
	}
	
	public static void insertionSort(int num[]) {			// 3 2 6 4 5 
					for(int i=1;i<num.length;i++) {
							int key = num[i];						//key = 2
							int j=i-1;										// j = 0
							while( j >=0 &&  key < num[j] ) {			// true 				num[j]=3
								num[j+1]=num[j];						// num[0+1]=num[0] 
								--j;
							}
							num[j+1]=key;
					}
	}
	public static void main(String[] args) {
		//int num[]= {5,3,2,7,8,1,6,9};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many number do you want to store");
		int n1 = sc.nextInt();
		int num[] = new  int[n1];
		for(int i=0;i<n1;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Element befor sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
	//	bubbleSort(num);
		insertionSort(num);
		System.out.println();
		System.out.println("Element After sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
	}

}
