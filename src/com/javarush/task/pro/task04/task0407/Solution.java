package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3

Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.

Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.

Требования:
•	Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
•	В программе необходимо использовать цикл while.
•	В программе необходимо использовать оператор continue.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        int count = 0;
        while (count < 100) {
            count++;
            if ((count % 3) == 0) continue;
            sum = count + sum;
        }
        System.out.println(sum);
    }
}