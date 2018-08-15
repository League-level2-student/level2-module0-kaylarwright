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
		Random num = new Random();
	for (int i = 0; i < r.length; i++) {
		System.out.println(num);
	}
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
