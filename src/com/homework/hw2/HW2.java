package com.homework.hw2;

public class HW2 {
    public static void main(String[] args) {

//        Задача 1

        int number = 5;

        if (number < 5) {
            System.out.println("Число меньше 5");
        } else if (number > 5) {
            System.out.println("Число больше 5");
        } else if (number == 5) {
            System.out.println("Число равно 5");
        }

//        Задача 2

        double height = 1.7D;
        double weight = 50D;
        double bodyMassIndex = weight / Math.pow(height, 2);
        System.out.println(bodyMassIndex);
        if (bodyMassIndex <= 16.5 ) {
            System.out.println("Крайний недостаток веса");
        } else if (bodyMassIndex >= 16.6) {
            System.out.println("Недостаток в весе");
        } else if (bodyMassIndex >= 25 ) {
            System.out.println("Нормальный вес тела");
        }



    }


}
