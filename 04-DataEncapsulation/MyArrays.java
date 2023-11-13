public class MyArrays {
    
    // Static method to count positive odd values in the array
    public static int odd(int[] array) {
        int count = 0;

        for (int value : array) {
            if (value > 0 && value % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    // Static method to calculate the sum of numbers greater than the mean
    public static int above(int[] array) {
        int sum = 0;
        int count = 0;

        // Calculate the mean of the array elements
        double mean = 0;
        for (int value : array) {
            mean += value;
        }
        mean /= array.length;

        // Sum numbers greater than the mean
        for (int value : array) {
            if (value > mean) {
                sum += value;
                count++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Sample arrays
        int[] arr1 = {3, 2, -5, 4, 1, -7};
        int[] arr2 = {5, 2, 7, 4, 2};

        // Using the odd method
        System.out.println("MyArrays.odd(arr1) returns " + MyArrays.odd(arr1));

        // Using the above method
        System.out.println("MyArrays.above(arr2) returns " + MyArrays.above(arr2));
    }
}