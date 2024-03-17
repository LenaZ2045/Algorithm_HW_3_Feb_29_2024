package com.telran.org.algorithmsHomeworks.algorithm_HW_4_Feb_29_2024;

import java.util.Scanner;

public class NumberAndItsSum {
    /* Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).

Ввод 179
Вывод 17

Ввод 985
Вывод  22 */

    public static void main(String[] args) { // main method to run our code here
        System.out.println("To calculate sum of all digits in numbers, enter 179 or 985 : "); // it asks user to enter a number
        Scanner scanner = new Scanner(System.in); // java library class calling scanner to read the value entered
        int n = scanner.nextInt(); // what type of the value to scan, it is INT value in my task
        int sum = numAndItsSum(n); // adding the digits of the number entered by calling recursively method to add
        System.out.println(sum);
    }

    public static int numAndItsSum(int n) { // returns value
        if (n < 10) { // checks if the number is one digit less than 10
            return n; // returns its digit value for
        } else { // or
            return n % 10 + numAndItsSum(n / 10); // value is divided by 10 LOGIC executes until 0
            // and collects all remainders to add them together
            // 179:10=17.9 takes (9) and for number 985:10=98.5 takes (5)
            // 17.9:10=1.79 takes (9+7) and for number 98.5:10=9.85 takes (5+8)
            // 1.79:10=0.179 takes (9+7+1) and for number 9.85:10=0.985 takes (5+8+9)
        }
    }
}