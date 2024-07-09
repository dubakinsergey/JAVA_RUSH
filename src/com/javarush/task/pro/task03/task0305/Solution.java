package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа

Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2
Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести их на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводи
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        if (one == two && two == three) {
            System.out.println(one + " " + two + " " + three);
        } else if (one == two) {
            System.out.println(one + " " + two);
        } else if (two == three) {
            System.out.println(two + " " + three);
        } else if (one == three) {
            System.out.println(one + " " + three);
        }
    }
}
