package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник

Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.

Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
•	В программе необходимо использовать вложенные циклы while (цикл в цикле).
•	Вывод на экран должен происходить в цикле while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int countHeight = 0;
        while (countHeight < 5){
            int countWidth = 0;
            while (countWidth < 10){
                System.out.print("Q");
                countWidth++;
            }
            System.out.println();
            countHeight++;
        }
    }
}