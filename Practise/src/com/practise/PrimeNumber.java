package com.practise;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 4;
		int count = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {

				count++;
			}
		}

		if (count == 2) {

			System.out.println("It is Prime Number");
		} else {
			System.out.println("It is not prime number");
		}

	}
}
