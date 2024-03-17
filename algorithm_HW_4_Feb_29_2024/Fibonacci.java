package com.telran.org.algorithmsHomeworks.algorithm_HW_4_Feb_29_2024;

public class Fibonacci {
    //    Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
    public static void main(String[] args) {
        int n = 10; // n is 10 numbers
        // prints Fibonacci: 0 1 1 2 3 5 8 13 21 34
        for (int i = 0; i < n; i++) // cycle repeats 10 times
            System.out.println(fibonacciRecursion(i) + " "); // cycle calls out the method to get all fibonacci

        System.out.println(fibonacciRecursion(n)); // the 10th number in fibonacci is 55
    }

    public static int fibonacciRecursion(int n) { // method returns numbers for fibonacci in length of 10 numbers
        if (n == 0) { // checking if numbers is 0
            return 0; // returns number 0
        } else if (n == 1) { // checking if number is 1
            return 1; // returns 1
        } else { // or
            System.out.print(n + " "); // I print to see how this works. I wish this would be explained clearly why #s repeat
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
}