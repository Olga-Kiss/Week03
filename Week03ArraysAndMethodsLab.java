//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] myArray = {0, 5, 2, 8, 13, 6};
		
		
		// 2. Print out the first element in the array
		System.out.println(myArray[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(myArray[myArray.length - 1]);
		
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(myArray[6]);

		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(myArray[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
	for (int i = 0; i < myArray.length; i++) {
		System.out.println(myArray[i]);
	}
			
		// 7. Write an enhanced for loop that prints out each element in the array
	for (int i: myArray) {
		System.out.println(i);
	}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
	double sum = 0;
	for (int i: myArray) {
		sum +=i;
	}
	System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
	double avr = sum/myArray.length;
	System.out.println(avr);
	
	
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
	for (int i: myArray) {
		if (i % 2 == 1) {
			System.out.println(i);
		}
	}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
	String[] array = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array
	int sumL = 0;
	for (int i = 0; i < array.length; i++) {
		sumL +=array[i].length();
	}
	System.out.println(sumL);
		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greet("Alice");
		greet("Olga");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		greet1("Artem");
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		test("Yallo", 8);
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(ifEqual(array, "Olga"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(smallestNumber(myArray));
		
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] array1 = {5, 5, 5, 7, 7, 7};
		System.out.println(averageNumber(array1));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] nameLength = convertArray(array);
		for (int number : nameLength) {
			System.out.println(number);
		}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(hasMoreEvenWordCharacters(array));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		System.out.println(isPalindrome("racecar"));
		
	}
	

	
	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello, " + name);
	}
	// Method 14:
	public static String greet1(String name1) {
		return ("Hello, " + name1);
			}

	// Method 15:
	public static void test(String string, int i) {
		System.out.println (string.length() > i);
		} 
	
	// Method 16:
	public static boolean ifEqual(String[] a, String b) {
		for (String i : a) {
			if (i.equals(b)) {
				return true;
			}
		} return false;
	}
	
	// Method 17:
	public static int smallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int i : numbers) {
			if (i < smallest) {
				smallest = i;
			} 
		} return smallest;
	}

	
	// Method 18:
	public static double averageNumber(double[] b) {
		double average = 0;
		for (double i : b) {
			average+=i;
		} return (average/b.length);
	}
		
	
	// Method 19:
	 public static int[] convertArray(String[] c) {
		int[] d = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			d[i] = c[i].length();
		} return d;
		
	 }                         

	
	// Method 20:
	 public static boolean hasMoreEvenWordCharacters(String[] array) {
			int evenLetters = 0;
			int oddLetters = 0;

			for (String string : array) {
				if (string.length() % 2 == 0) {
					evenLetters += string.length();
				} else {
					oddLetters += string.length();
				}
			}

			return evenLetters > oddLetters;
		}
	
	// Method 21:
	
	 public static boolean isPalindrome(String string) {
			for (int i = 0; i < string.length() / 2; i++) {
				if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
					return false;
				}
			}
			return true;
		}
}