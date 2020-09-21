package cz.verunka.training;

/**
 * Created by Veronika on 05.07.2016.
 */

// Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
// Return true if the array contain any triples.

public class NoTriples {

    public boolean areThereTriples(int[] array) {

        int temp = array[0];
        int counter = 1;

        for (int i=1; i<array.length; i++) {

            if (array[i] == temp) {
                counter++;
                if (counter >= 3) {
                    return true;
                }
            } else {
                temp = array[i];
                counter = 1;
            }
        }
        return false;
    }
}
