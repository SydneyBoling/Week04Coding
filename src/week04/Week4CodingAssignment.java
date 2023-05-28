package week04;


import java.util.Arrays;


public class Week4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// #1 Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.	
	int [] ages = { 3, 9, 23, 64, 2, 8, 28, 93}; 
	// 1a Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
	int lengthOfAges = ages.length; 
	int subtract = Math.abs(ages[lengthOfAges - lengthOfAges] - ages[lengthOfAges - 1]);
	
	System.out.println("Question 1a: " + "The difference of the first element and the last element is: " + subtract);
	// 1b Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
	int [] newAges = new int[ages.length + 1];
	int appendValue = 27;
	System.out.println("ages: " + Arrays.toString(ages));
	for (int i = 0; i < ages.length; i++) {
		newAges[i] = ages[i];
	}
		newAges[ages.length] = appendValue;
		System.out.println( "Question 1B: " + "newAges: " + Arrays.toString(newAges));
	//1c Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int length = newAges.length;
		double sum = 0.0;
		for(int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
		}
		 double average = sum / length;
		 System.out.println("Question 1c: " + "Average of the new array: " + average);
		
	// #2 Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
		 //2a Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		  int total = 0;
		  for( int i = 0; i < names.length; i++) {
			  total += names[i].length();
		  }
		  int newAverage = total / names.length;
		  System.out.println("Question 2A: " + "The average number of letters per name is: " + newAverage);
		  
		  //2b Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		  String totalNames = "";
		  for (int i = 0; i < names.length; i++) {
			  totalNames += names[i] + " ";
		  }
		  System.out.println("Question 2B: " + totalNames);
		  
		  
		  //#3
		  //How do you access the last element of any array?
		   // array[array.length -1] 
		  
		  //#4 
		  // How do you access the first element of any array?
		  // array[0]
		  
		  //#5 Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		  int [] nameLengths = new int [names.length]; 
		  for (int i = 0; i < names.length; i++) {
			  nameLengths[i] = names[i].length();
		  }
		  
		  //#6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		  int thisSum = 0; 
		  for (int i = 0; i < nameLengths.length; i++) {
			  thisSum += nameLengths[i];
		  }
		  System.out.println("Question 6: " + thisSum);
		  
		  //#7 Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		  System.out.println("Question 7 : " + newWord("Goodbye", 4));
		  
		  //#8 Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		  System.out.println("Question 8 : " + fullName("Sydney", "Boling"));
		  
		  //#9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		  System.out.println("Question 9 : " + greaterThan(ages));
		  
		  //#10 Write a method that takes an array of double and returns the average of all the elements in the array.
		  double [] arr = { 7.4, 11.3, 23.0, 678.3};
		  System.out.println("Question 10 : " + doubleTheArray(arr));
		  
		  //#11 Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		  double [] secondDoubleArr = {12.3, 456.7, 89.0, 123.4};
		  System.out.println("Question 11: " + whatDoICallThis(arr, secondDoubleArr));
		  
		  //#12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		  boolean isHotOutside = true;
		  double moneyInPocket = 40.0;
		
		  
		  System.out.println("Question 12: " + willBuyDrink(isHotOutside, moneyInPocket));
		  
		  //#13 Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 double myPaycheck = 1250.0;
		 double myExpenses = 1135.1;
		 
		 if (myPaycheck > myExpenses) {
				System.out.println("Question 13: " + "You have enough money for your expenses.");
			} else {
				System.out.println("Question 13: " + "You will have to pull money from savings to cover expenses.");
			}
		 // I created a method to check if I have enough money from my paycheck to pay my bills and decided if I need to pull from savings
	
	
	
	}
	
	
	public static String newWord(String word, int n) {
		String newWord = "";
				for (int i = 0; i < n; i++) {
					newWord += word;
				}
				return newWord;
	}
	
	public static String fullName(String firstName, String lastName) {
		return "The full name is: " + " " + firstName + " " + lastName + ".";
	}
	
	public static boolean greaterThan(int [] myArray) {
		return Arrays.stream(myArray).sum()>100;
	}
	
	public static double doubleTheArray(double [] arr) {
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	
	public static boolean whatDoICallThis( double [] firstArray, double [] secondArray) {
		return doubleTheArray(firstArray) > doubleTheArray(secondArray);
	}
		
	public static boolean willBuyDrink( boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50){
				return true;
			} else {
				return false;
			}
	}
	
	public static void myOwnMethod(double myExpenses, double myPaycheck) {
		 
	}
	
	
		
	
	}
	
		  
		  
		  
		  

		  


