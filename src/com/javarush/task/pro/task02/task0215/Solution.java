package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел


Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.

Пример ввода:

51
101
201
Пример вывода:

117
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.

Требования:
•	Программа должна считывать с клавиатуры три целых числа.
•	Программа должна выводить на экран среднее арифметическое считанных чисел.
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        int avg = (one + two + three) / 3;
        System.out.println(avg);

    }
}
