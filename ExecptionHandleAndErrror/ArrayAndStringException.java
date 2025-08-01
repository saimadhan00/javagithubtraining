package ExecptionHandleAndErrror;

public class ArrayAndStringException {

    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException example
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);  // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException example
        String str = "Hello";
        try {
            System.out.println(str.charAt(10));  // invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
