package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много

В этой задаче нужно:

Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
Пример ввода:
абв
2

Пример вывода:
абв
абв

Требования:
•	Программа должна считывать данные c клавиатуры.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран строку number раз.
•	Программа должна выводить на экран строку один раз, если число number меньше/равно 0 или больше/равно 5.
•	В программе необходимо использовать цикл do-while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt();
        do {
            System.out.println(str);
            number--;
        } while ((number > 0) && (number < 4));
    }
}