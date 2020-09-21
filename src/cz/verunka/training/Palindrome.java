package cz.verunka.training;

/*
    A palindrome is a word that reads the same backward or forward. Write a function that checks if a given word is a palindrome. Character case is significant.

    Example:
    word = "dabcbad" returns true, word = "Deed" returns false (character cases differ)
 */

public class Palindrome {

    public boolean isPalindrome(String word) {

        System.out.print(word + ": ");

        int length = word.length()-1;
        int index = 0;

        while (length - index >= 1) {

            if (word.charAt(length) != word.charAt(index)) {
                return false;
            }
            length--;
            index++;
        }
        return true;
    }
}
