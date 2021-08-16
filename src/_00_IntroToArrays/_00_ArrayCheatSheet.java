package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] x = {"a","2","3","d","e"};
		//2. print the third element in the array
		System.out.println(x[2]);
		//3. set the third element to a different value
		x[2] = "H";
		//4. print the third element again
		System.out.println(x[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < x.length; i++) {
			x[i] = "HI!";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		//7. make an array of 50 integers
		int[] y = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
		//8. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for (int i = 0; i < y.length; i++) {
			y[i]=randy.nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestIntLocation = 0;
		for (int i = 0; i < y.length; i++) {
			if(i>0) {
				if(y[i]<y[smallestIntLocation]) {
					smallestIntLocation = i;
				}
			}
		}
		System.out.println("Smallest: ");
		System.out.println(y[smallestIntLocation]);
		//10 print the entire array to see if step 8 was correct
		System.out.println("Array: ");
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
		//11. print the largest number in the array.
		int largestIntLocation = 0;
		for (int i = 0; i < y.length; i++) {
			if(i>0) {
				if(y[i]>y[largestIntLocation]) {
					largestIntLocation = i;
				}
			}
		}
		System.out.println("Largest: ");
		System.out.println(y[largestIntLocation]);
		//12. print only the last element in the array
		System.out.println("Last value: ");
		System.out.println(y[y.length-1]);
	}
}
