package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно

Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".

Требования:
•	Программа должна считывать значение температуры c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если температура меньше 0, вывести только сообщение "на улице холодно".
•	Если температура больше либо равна 0, вывести только сообщение "на улице тепло".
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
