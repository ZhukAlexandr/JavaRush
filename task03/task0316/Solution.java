package com.javarush.task.task03.task0316;

/* 
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {
        //3. Текст первый строки должен быть: It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        //4. Текст второй строки должен быть:
        //                                      It's Java string: "C:\\Program Files\\Java\\jdk1.7.0\\bin\"
        //                                      It's Java string: "C:\\Program Files\\Java\\jdk1.7.0\\bin\"
        //напишите тут ваш код
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}
