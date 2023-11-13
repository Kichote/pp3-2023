public class C4 {
    // Static method to count the number of even values in the array
    public static int even(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Static method to count the number of positive odd numbers in the array
    public static int positiveOdd(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Sample arrays
        int[] arr1 = {2, -6, 5, 8};
        int[] arr2 = {3, 2, -5, 4, 1, -7};

        // Sample usage
        System.out.println("even(arr1): " + even(arr1));
        System.out.println("positiveOdd(arr2): " + positiveOdd(arr2));
    }
}