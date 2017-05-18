package com.javarush.task.task05.task0520;

/*
Собираем прямоугольник
*/

public class Rectangle {
    private int top, left, width, height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public  Rectangle(Rectangle rect){
        this.height = rect.height;
        this.width = rect.width;
        this.left = rect.left;
        this.top = rect.top;
    }

    public static void main(String[] args) {

    }
}
