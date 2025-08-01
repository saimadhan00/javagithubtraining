package ExecptionHandleAndErrror;



	import java.util.Scanner;

	public class DivisionExample {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first integer: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter second integer: ");
	        int num2 = scanner.nextInt();

	        try {
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	        
	        scanner.close();
	    }
	}

