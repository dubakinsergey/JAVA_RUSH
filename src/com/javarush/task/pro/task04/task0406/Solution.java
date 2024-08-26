package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем

Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Слово "enough" выводить не нужно.
Для этого необходимо использовать бесконечный цикл (while(true)).

Подсказка: чтобы завершить бесконечный цикл, используй оператор break.

Требования:
•	Программа должна считывать данные c клавиатуры.
•	В программе необходимо использовать цикл while.
•	Для завершения бесконечного цикла необходимо использовать оператор break.
•	Программа должна выводить в консоли все введенные данные с новой строки, пока не будет введено слово "enough".
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if (str.equals("enough"))break;
            System.out.println(str);
        }
    }
}