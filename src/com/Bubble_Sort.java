package com;

import java.util.Arrays;

public class Bubble_Sort {
	public void bubbleSort(int[] a){
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		int[] a={12,8,7,5,2};
		new Bubble_Sort().bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}
