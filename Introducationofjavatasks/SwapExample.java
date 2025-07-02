package Introducationofjavatasks;

public class SwapExample {

	public static void main(String[] args) {
		  int num1 = 15; 
	        int num2 = 30; 

	        System.out.println("Before swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	       
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        
	        System.out.println("After swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	    }
	}
