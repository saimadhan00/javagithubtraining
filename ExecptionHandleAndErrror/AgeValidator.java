package ExecptionHandleAndErrror;

//Custom Exception class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class AgeValidator {
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or older.");
     } else {
         System.out.println("Age is valid.");
     }
 }

 public static void main(String[] args) {
     int age = 16;  

     try {
         checkAge(age);
     } catch (InvalidAgeException e) {
         System.out.println("InvalidAgeException caught: " + e.getMessage());
     }
 }
}
