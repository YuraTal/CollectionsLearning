package ru.synergy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat [] cats = new Cat[3];
        cats[0] = new  Cat("Томас");
        cats[1] = new  Cat("Бегемот");
        cats[2] = new  Cat("Филип Маркович");
        cats[3] = new  Cat("Котяра");

        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

    }
}