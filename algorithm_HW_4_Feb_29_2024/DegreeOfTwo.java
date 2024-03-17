package com.telran.org.algorithmsHomeworks.algorithm_HW_4_Feb_29_2024;

import java.util.Scanner;

public class DegreeOfTwo {
   /* Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
    Операцией возведения в степень пользоваться нельзя!

    Ввод 8
    Вывод: YES
    Ввод 3
    Вывод: NO */

    public static void main(String[] args) {
        System.out.println("Enter one number 8 or 3 : "); // to check another number, press button run again
        Scanner scanner = new Scanner(System.in); // entering numbers from console 8 or 3
        int n = scanner.nextInt(); // scanner reads the number
        if (isDegreeOfTwo(n)) { // cycle checks if number is dividable on 2 by calling boolean method isDegreeOfTwo
            System.out.println("YES"); // string prints "yes" if number divided on 2 without remainder
        } else { // or
            System.out.println("NO"); // string prints "no" if number divided on 2 with remainder
        }
    }

    public static boolean isDegreeOfTwo(int n) {
        if (n == 1) { // checks if 2:2=1 then it is a number of degree of 2
            return true; // returns true or "yes" in our task
        } else if (n % 2 == 0 && n != 0) { // checks if number divides on 2 without remainder and number not equals 0
            return isDegreeOfTwo(n / 2); // we are repeating the method call to divide on 2 until it will equal 1
        } else { // else number can not be divided on 2 without remainder
            return false; // returns false or "no" in our task
        }
    }
}