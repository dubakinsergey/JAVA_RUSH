package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование

Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.

Требования:
•	Программа должна считывать данные c клавиатуры.
•	Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
•	В программе необходимо использовать цикл while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;

            } else if (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                isExit = str.equals("ENTER");
            }
        }
        System.out.println(sum);
    }
}