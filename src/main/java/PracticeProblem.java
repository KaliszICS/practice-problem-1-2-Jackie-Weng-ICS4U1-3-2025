public class PracticeProblem {
    public static int sum2D(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                sum += array[i][j];
            }
        }
        return sum;
    }
    
    public static boolean validIndex(int[] array, int index) {
        try {
            int temp = array[index]; 
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Sum of elements: " + sum2D(numbers)); 
        
        int[] sampleArray = {10, 20, 30, 40};
        System.out.println("Is index 2 valid? " + validIndex(sampleArray, 2)); 
        System.out.println("Is index 5 valid? " + validIndex(sampleArray, 5)); 
    }
}
public class PracticeProblem {
    public static int sum2D(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // 
            for (int j = 0; j < array[i].length; j++) { // 
                sum += array[i][j];
            }
        }
        return sum;
    }
    
    public static boolean validIndex(int[] array, int index) {
        try {
            int temp = array[index]; 
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
    
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Sum of elements: " + sum2D(numbers)); 
        
        int[] sampleArray = {10, 20, 30, 40};
        System.out.println("Is index 2 valid? " + validIndex(sampleArray, 2)); 
        System.out.println("Is index 5 valid? " + validIndex(sampleArray, 5)); 
        
        System.out.println("10 / 2 = " + divide(10, 2)); 
        System.out.println("10 / 0 = " + divide(10, 0)); 
    }
}
