package cz.verunka.training;

/**
 * Created by Veronika on 15.06.2016.
 */

public class ArrayStructures {

    private int[] intsArray = new int[10];

    public void generateRandomArray() {

        for (int i = 0; i< intsArray.length; i++) {
            intsArray[i] = (int) (Math.random()*10)+10;
        }
    }

    public void printArray() {

        for (int i = 0; i< intsArray.length; i++) {
            System.out.print(i + ".  ");
            System.out.print(intsArray[i] + "  |  ");
        }
        System.out.println();
    }

    public int getValueByIndex(int index) {

        if (index< intsArray.length-1) {
            return intsArray[index];
        }
        return 0;
    }

    public boolean contain(int value) {

        for (int i = 0; i< intsArray.length; i++) {
            if (intsArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    public String searchValues(int value) {

        String result = "";

        for (int i = 0; i< intsArray.length; i++) {
            if (intsArray[i] == value) {
                result += i + ", ";
            }
        }
        return "Indexes: " + result;
    }

    public void bubbleSort() {

        for (int i = 0; i< intsArray.length-1; i++) {
            for (int j = 0; j< intsArray.length-i-1; j++) {

                if (intsArray[j] > intsArray[j + 1]) {
                    int temp = intsArray[j];
                    intsArray[j] = intsArray[j + 1];
                    intsArray[j + 1] = temp;
                }
            }
        }
    }
}