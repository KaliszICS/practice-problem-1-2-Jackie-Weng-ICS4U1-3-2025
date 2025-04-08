public class PracticeProblem {

    public static boolean validIndex(int[] array, int index) {
        try {
            return index >= 0 && index < array.length;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static int safeConvertStringtoInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(validIndex(array, 2));
        System.out.println(validIndex(array, 5)); 

        System.out.println(divide(10, 2)); 
        System.out.println(divide(10, 0)); 

        System.out.println(safeConvertStringtoInt("123")); 
        System.out.println(safeConvertStringtoInt("abc")); 
    }
}