/**
 * 
 */
package com.will.algorithm.sort;

import java.util.Arrays;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int[] arr = new int[10];
		for(int i = 0;i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100 );
		}
		
		int[] bubbleArr = Arrays.copyOf(arr, arr.length);
		System.out.println("bubble before: " + Arrays.toString(bubbleArr));
		startTime = System.currentTimeMillis();
		Client.bubbleSort(bubbleArr);
		System.out.println("bubbleSort: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("bubble after: " + Arrays.toString(bubbleArr));
		
		int[] selectArr = Arrays.copyOf(arr, arr.length);
		System.out.println("select before: " + Arrays.toString(selectArr));
		startTime = System.currentTimeMillis();
		Client.selectSort(selectArr);
		System.out.println("selectSort: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("select after: " + Arrays.toString(selectArr));
		
		
	}
	
	private static void bubbleSort(int[] arr){
		for(int out = arr.length - 1; out > 1; out--){
			for(int in = 0; in < out; in++){
				if(arr[in] > arr[in + 1]){
					arr[in] = arr[in] + arr[in + 1];
					arr[in + 1] = arr[in] - arr[in + 1];
					arr[in] = arr[in] - arr[in + 1];
				}
			}
		}
	}
	
	private static void selectSort(int[] arr){
		int min;
		for(int out = 0; out < arr.length; out++){
			min = out;
			for(int in = out + 1; in < arr.length; in++){
				if(arr[in] < arr[min]){
					min = in;
				}
			}
			
			if(min != out){
				arr[min] = arr[min] + arr[out];
				arr[out] = arr[min] - arr[out];
				arr[min] = arr[min] - arr[out];
			}
		}
	}
	
	private static void insertionSort(int[] arr){
		for(int out = 0; out < arr.length - 1; out++){
			
		}
	}
}
