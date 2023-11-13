import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {
    
    public int even(int[] array) {
        int value= 0;
        for(int i : array) {
            if (i%2 == 0) {
                value ++;
            }
        }
        return value;
    }

    public int positiveOdd(int[] array) {
        int value = 0;
        for(int i : array) {
            if ((i%2 != 0) && i > 0) {
                value ++;
            }
        }
        return value;
    }

    public int[] reverse(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }
        return reversedArray;
    }

    public boolean compare(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        return Arrays.equals(array1, array2);
    }

    public int[] different(int[] array1, int[] array2) {
        List<Integer> missingList = new ArrayList<>();

        List<Integer> array2List = Arrays.asList(Arrays.stream(array2).boxed().toArray(Integer[]::new));

        for (int num : array1) {
            if (!array2List.contains(num)) {
                missingList.add(num);
            }
        }

        int[] missingNumbers = new int[missingList.size()];
        for (int i = 0; i < missingList.size(); i++) {
            missingNumbers[i] = missingList.get(i);
        }

        return missingNumbers;
    }

    public boolean exists(int number, int[] array) {
        for(int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public int secondMax(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        int[] testArray = {1, 3, 5, 7, 8, -2, -1, -3};
        int[] testArray2 = {1,3,5};
        int[] testArray3 = {2,3,6,5};
        System.out.println(myArray.even(testArray));
        System.out.println(myArray.positiveOdd(testArray));
        System.out.println(myArray.reverse(testArray));
        System.out.println(myArray.compare(testArray2, testArray3));
        System.out.println(myArray.different(testArray2, testArray3));
        System.out.println(myArray.exists(1, testArray));
        System.out.println(myArray.secondMax(testArray));
    }
}
