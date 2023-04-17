package com.homework.hw1;

public class HW1 {
        public static void main(String[] args) {
            //        Задача 2

            int x = 20;
            x += 50;
            System.out.println(x);

            int u = 100;
            int m = u * 2;
            System.out.println(m);


            double k = 1.0 / 5 * 1000D;
            System.out.println((int)k);

//            Задача 4

            int productAPrice = 200;
            int productBPrice = 30;
            double productDiscountA = 0.15D;
            int numberOfGoodsA = 10;
            int numberOfGoodsB = 2;
            double priceWithDiscountA = (double)productAPrice - (double)productAPrice * productDiscountA;
            double amountA = priceWithDiscountA * (double)numberOfGoodsA;
            int amountB = productBPrice * numberOfGoodsB;
            System.out.println((int)amountA + amountB);
        }

}
