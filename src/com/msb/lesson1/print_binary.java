package com.msb.lesson1;

public class print_binary {
	public static void main(String[] args) {
//		int num = Integer.MIN_VALUE;
//		for (int i = 31; i >= 0 ; i--) {
//			System.out.print((num & (1 << i)) == 0 ? "0" : "1");
//		}
//		System.out.println();
		int n = 10;
		System.out.println(factorial(n));


	}

	public static long factorial(int n) {
		int ans = 0;
		int cur = 1;
		for (int i = 1; i <= n; i++) {
			cur = cur * i;
			ans += cur;
		}
		return ans;
	}
}
