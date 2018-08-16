package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] a = new String[5];
		//2. print the third element in the array
		System.out.println(a[3]);
		//3. set the third element to a different value
		a[3] = "Kayla";
		//4. print the third element again
		System.out.println(a[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//6. make an array of 50 integers
		int [] r = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		Random number = new Random();
		int num = number.nextInt(50);
		for (int q = 0; q < r.length; q++) {
			r[q] = number.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int x = r[0];
		for (int w = 0; w < r.length; w++) {
			if (r[w]<x) {
				x = r[w];
			}
		}
		System.out.println(x);
		//9 print the entire array to see if step 8 was correct
		for (int e = 0; e < r.length; e++) {
			System.out.println(r[e]);
		}
		//10. print the largest number in the array.
		int y = r[0];
		for (int t = 0; t < r.length; t++) {
			if (r[t]>y) {
				y = r[t];
			}
			
		}
		System.out.println(y);
	}
}
