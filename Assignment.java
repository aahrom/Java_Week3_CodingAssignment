import java.util.ArrayList;  
import java.util.Arrays;  

public class CodingAssigment {
    public static void main(String args[]) {
        
        /*1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.*/
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        /* a. Programmatically subtract the value of the first element in the array 
        * from the value in the last element of the array (i.e. do not use ages[7] in your code).
        Print the result to the console.*/
        int subtract = ages[0] - ages[ages.length - 1];
        
        System.out.println(subtract);
        
        /*b. Add a new age to your array and repeat the step above 
        to ensure it is dynamic (works for arrays of different lengths).*/
        int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 2};
        
        int newSubtract = newAges[0] - newAges[newAges.length - 1];
        
        System.out.println(newSubtract);
        
        /*c. Use a loop to iterate through the array and 
        calculate the average age. Print the result to the console.*/
        double averageAge;
        int count = 0;
        
        for(int i = 0; i < ages.length; i++) {
            count += ages[i];
        }
        
        averageAge = count/ages.length;
        
        System.out.format("Average age: %.2f", averageAge );
        
        /*2. Create an array of String called names that contains the following values:
        “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.*/
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        /*a. Use a loop to iterate through the array and calculate the average number of letters per name. 
        Print the result to the console.*/
        int countLetter = 0;
        double averageLetters;
        
        for(int x = 0; x < names.length; x++) {
            countLetter += names[x].length();
        }
        
        
        averageLetters = countLetter / names.length;
        
        System.out.format("\nAverage number of letters per name: %.2f", averageLetters);
        
        /*b. Use a loop to iterate through the array again and concatenate all the names together,
        separated by spaces, and print the result to the console. */
	    String storeNames = "";
		for (int y = 0; y < names.length; y++) {
			storeNames += names[y] + " ";
		}
		
		System.out.println("");
		System.out.println(storeNames);
     
       // 3. How do you access the last element of any array?
       System.out.println("Using this syntax: exampleArray[exampleArray.length - 1];");
        
       // 4. How do you access the first element of any array?
       System.out.println("Using this syntax: exampleArray[0];");
                
        /*5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names 
        array and add the length of each name to the nameLengths array.*/
        int namesLengths[] = new int[names.length];
        int sumLengths = 0;
        
        for(int i = 0; i < names.length; i++) {
            namesLengths[i] = names[i].length();
        }
        
        for(int i = 0; i < namesLengths.length; i++){
            sumLengths += namesLengths[i];
        }
        
        System.out.format("Sum of all the elements from the names array: %d", sumLengths);


    }
    
    
            
        /*7. Write a method that takes a String, word, and an int, n, as arguments and 
        returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
        I would expect the method to return “HelloHelloHello”).*/
        public static String concatenateString(String word, int number) {
            String concatMe = "";    
            for(int i = 0; i <= number; i++){
                concatMe += word;
            }
            
            return concatMe;
        }
        
        
        /*8. Write a method that takes two Strings, firstName and lastName, 
        and returns a full name (the full name should be the first and the last name as a String separated by a space).*/
        public static String fullName(String firstName, String lastName) {
            String name = firstName + " " + lastName;
            
            return name;
        }
        
        /*9. Write a method that takes an array of int and returns true if the sum of all the ints in 
        the array is greater than 100.*/
        public static boolean sumCheck(int arr[]) {
            
            int sum = 0;
            boolean check = false;
            
            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            
            if(sum > 100){
                check = true;
            }
            
            return check;
        }
        
        
        //10. Write a method that takes an array of double and returns the average of all the elements in the array.
        public static double average(double arr[]){
            int total = 0;
            double result = 0;
            
            for(int i = 0; i < arr.length; i++){
                total += arr[i];
            }
            
            result = total / arr.length;
            
            return result;
            
        }
        
        
        
        //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
            public static boolean averageOfTwo(double arr1[], double arr2[]){
            int total1 = 0;
            double result1 = 0;
            int total2 = 0;
            double result2 = 0;
            boolean check = false;
            
            for(int i = 0; i < arr1.length; i++){
                total1 += arr1[i];
            }
            
            result1 = total1 / arr1.length;
            
            for(int j = 0; j < arr2.length; j++) {
                total2 += arr2[j];
            }
            
            result2 = total2 / arr2.length;
            
            if(result1 > result2){
                check = true;
            }
            
            return check;
        }
        
        
        
        //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
            boolean check = false;
            
            if(isHotOutside && (moneyInPocket > 10.50)) {
                check = true;
            }
            
            return true;
        }
        
        
        
        //13. method prints out how much money you should set aside for savings every month. Takes in monthlySalary as an argument and returns savings amount
        public static double savingsAccount(double monthlySalary) {
            
            return monthlySalary * 0.2;
        }
        
}
