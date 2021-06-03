package com.msb.lesson1;

public class Sort {

	public static void selectSort(int[] arr) {
		if (arr == null || arr.length < 2) return;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minValueIndex = i;
			for (int j = i + 1; j < n; j++) {
				minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
			}
			swap(arr, i, minValueIndex);
		}
	}

	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length < 2) return;
		int n = arr.length;
		for (int end = n - 1; end >= 0; end--) {
			for (int second = 1; second <= end; second++) {
				if (arr[second - 1] > arr[second]) {
					swap(arr, second - 1, second);
				}
			}
		}
	}

	public static void insertSort(int[] arr) {
		if (arr == null || arr.length < 2) return;
		int n = arr.length;
		for (int end = 1; end < n; end++) {
			for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1] ; pre--) {
				swap(arr, pre, pre + 1);
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {7, 1, 3, 5, 1, 6, 8, 1, 3, 5, 7, 5, 6};
		printArray(arr);
		insertSort(arr);
		//bubbleSort(arr);
		//selectSort(arr);
		printArray(arr);
	}
}
