package com.javarush.task.pro.task02.task0204;

/* 
9-ка это перевернутая 6-ка

Используя только оператор инкремента, измени значение в переменной six, чтобы на экран вывелась цифра 9.
Требования:
•	Не изменяй команду объявления переменной six.
•	К переменной six нужно применить несколько команд инкремента, чтобы она изменила значение на 9.
•	Программа должна выводить на экран переменную six со значением 9.
*/

public class Solution {

    public static void main(String[] args) {
        int six = 6;

        //напишите тут ваш код
        six++;
        six++;
        six++;


        System.out.println(six);
    }
}
