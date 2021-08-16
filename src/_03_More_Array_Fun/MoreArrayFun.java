package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static String[] Array = {"a","b","c","d","e","f","g","h","i","j"};
	public static void main(String[] args) {
		Print(Array);
		System.out.println();
		ReversePrint(Array);
		System.out.println();
		PrintEveryOther(Array);
		System.out.println();
		PrintRandomly(Array);
		
	}
	 //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	static void Print(String arr[]){
		for(int i = 0; i<arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order./
	void ReversePrint(String arr[]){
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	static //4. Write a method that takes an array of Strings and prints every other String in the array.
	
	void PrintEveryOther(String arr[]){
		for(int i = 0; i<arr.length-1; i+=2) {
			System.out.println(arr[i]);
		}
	}
	
	static //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void PrintRandomly(String arr[]){
		String printArr[]=arr;
		int printed = 0;
		int printedArr[]= new int[arr.length];
		for (int i = 0; i < printedArr.length; i++) {
			printedArr[i] = 0;
		}
		Random r = new Random();
		while(printed<arr.length-1) {
			int value=r.nextInt(printArr.length);
			for (int j = 0; j < printArr.length; j++) {
				if(printedArr[value] == 0) {
					System.out.println(printArr[value]);
					printedArr[value]=1;
					printed++;
					break;
				}
			}
		}
	}
	
}
