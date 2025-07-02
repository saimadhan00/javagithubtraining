package Introducationofjavatasks;

public class DigitCounter {

	public static void main(String[] args) {
		int number = 12345; 
        int count = 0;
        int temp = number; 

        if (number == 0) {
            count = 1; 
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}