package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел

Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.

Пример ввода:
8
9
8
4
5
e

Пример вывода:
8

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное четное из введенных целых чисел.
•	Если введено несколько максимальных четных чисел, необходимо вывести любое.
•	Если среди введенных символов нет четного числа или введен только один не числовой символ, то вывести на экран минимальное значение числа типа int.
•	Считывать данные с клавиатуры необходимо в цикле while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if ((x % 2 == 0) && (x > max)) {
                max = x;
            }
        }
        System.out.println(max);
    }
}