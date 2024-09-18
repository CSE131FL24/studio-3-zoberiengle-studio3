package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		int multiple = 0;


		Scanner in =new Scanner(System.in);
		System.out.print("How far do you want to scan: ");
		int n = in.nextInt();	
		int [] array = new int [n-1];

		for (int i=0; i<n-1; i++) {
			array[i]=i+2;
		}
		System.out.println("All numbers prime or not: ");
		for(int value: array) {
			System.out.print(value + " ");
		}
		for (int i = 0; i<array.length;i++) {
			if (!(array[i]==0)){
				for(int count = 2; count<(n/2); count++) {
					multiple = array[i] * count;
					for(int y=0; y<array.length; y++) {
						if (array[y]==multiple) {
							array [y]=0;
						}
					}
				}
			}
		}
		System.out.println("");
		System.out.println("All prime numbers: ");
		for(int value: array) {
			if(!(value==0)){
				System.out.print(value + " ");
			}
		}
	}
}
