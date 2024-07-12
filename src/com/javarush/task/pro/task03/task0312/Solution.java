package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки

Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
•	Если строки разные, то программа должна вывести сообщение "строки разные".
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        boolean result = str1.equals(str2);

        if (result) {
            System.out.println("строки одинаковые");
        } else System.out.println("строки разные");
    }
}
