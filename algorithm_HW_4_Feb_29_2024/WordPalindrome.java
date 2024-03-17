package com.telran.org.algorithmsHomeworks.algorithm_HW_4_Feb_29_2024;

import java.util.Scanner;

public class WordPalindrome {
    //    Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.
    public static void main(String[] args) { // main method to execute our code
        System.out.println("Enter word like (code doc, trapped depart, say as) "); // asks user to enter a word
        Scanner scanner = new Scanner(System.in); // reads typed chars
        String input = scanner.nextLine(); // scanning the string

        // Removing spaces and changing letters to the lower case
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // calls out method to execute logic in this method
        if (checkPalindrome(cleanedInput, 0, cleanedInput.length() - 1)) { // takes word, first and last char
            System.out.println(input + " - is a palindrome."); // after checking prints if string passed method logic and true
        } else {
            System.out.println(input + " - not a palindrome.");// after checking prints if string passed method logic and false
        }
    }

    // Recursive function, which checks, if scanned string is a palindrome
    static boolean checkPalindrome(String str, int start, int end) { // boolean method takes word, first, last chars
        if (start >= end) { // if start is an end or more than the end
            // do we see one symbol or empty string, it is palindrome
            return true; // positive 'yes' 'true'
        } else if (str.charAt(start) != str.charAt(end)) { // or if
            // is first != last char, this is not a palindrome
            return false; // negative 'no' 'false'
        } else { // or
            // recursively checks inside part of a string
            return checkPalindrome(str, start + 1, end - 1); // executes recursively until it hits that start is an end
        }
    }
}