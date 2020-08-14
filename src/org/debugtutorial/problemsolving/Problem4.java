package org.debugtutorial.problemsolving;

public class Problem4 {
	public static void main(String[] args) 
    { 
        int[] numbers = new int[4]; 
        for (int i=1; i<5; i++) 
        { 
            System.out.println("About to try to insert " + i + " into the array at position " + i); 
            numbers[i] = i; 
            System.out.println("Successful"); 
        } 

        System.out.print("This is what is in the array: "); 
        for (int i=1; i<5; i++) 
        { 
            int element = numbers[i]; 
            System.out.print(element + " "); 
        } 
        System.out.println(); 
    } 

}
