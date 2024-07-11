package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность

Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Если числа равны, то программа должна вывести сообщение "числа равны".
•	Если числа не равны, то программа должна вывести сообщение "числа не равны".
•	Точность сравнения должна достигать одной миллионной (0.000001).
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (Math.abs(num1 - num2) < 0.000001) {
            System.out.println("числа равны");
        } else
            System.out.println("числа не равны");
    }
}
