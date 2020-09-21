package cz.verunka.training;

/*
    Given an unsorted integer array, place all zeros to the end of the array without changing the sequence of non-zero elements.

    Example:
    list1 = [1,3,0,8,12,0,4,0,7] return [1,3,8,12,4,7,0,0,0]
 */

public class PlaceZeroes {

    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public int[] moveZerosToEnd(int[] inputArray) {

        int[] resultArray = new int[inputArray.length];
        int resultIndex = 0;

        for (int i = 0; i < inputArray.length; i++ ) {

            if (inputArray[i] != 0) {

                resultArray[resultIndex] = inputArray[i];
                resultIndex++;
            }
        }
        return resultArray;
    }
}
