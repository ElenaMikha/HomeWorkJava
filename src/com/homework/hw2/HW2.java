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
        double weight = 120D;
        double bodyMassIndex = weight / Math.pow(height, 2);
        System.out.println(bodyMassIndex);
        if (bodyMassIndex <= 16.5) {
            System.out.println("Крайний недостаток веса");
        } else if (bodyMassIndex <= 18.4) {
            System.out.println("Недостаток в весе");
        } else if (bodyMassIndex <= 24.9) {
            System.out.println("Нормальный вес тела");
        } else if (bodyMassIndex <= 30) {
            System.out.println("Избыточная масса тела");
        } else if (bodyMassIndex <= 34.9) {
            System.out.println("Ожирение (Класс I)");
        } else if (bodyMassIndex <= 40) {
            System.out.println("Ожирение (Класс II - тяжелое)");
        } else if (bodyMassIndex > 40) {
            System.out.println("(Класс III - крайне тяжелое)");
        }
//             Задача 3

        int day = 7;
        switch (day) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }case 2: {
                System.out.println("Вторник");
                break;
            }case 3 : {
                System.out.println("Среда");
                break;
            }case 4: {
                System.out.println("Четверг");
                break;
            }case 5: {
                System.out.println("Пятница");
                break;
            }case 6: case 7: {
                System.out.println("Выходной");
                break;
            } default:
                System.out.println("Это не день недели");
        }

    }


}
