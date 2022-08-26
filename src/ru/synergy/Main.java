package ru.synergy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Cat [] cats = new Cat[4];
        cats[0] = new  Cat("Томас");
        cats[1] = new  Cat("Бегемот");
        cats[2] = new  Cat("Филип Маркович");
        cats[3] = new  Cat("Котяра");

        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catsList = new ArrayList<>();
        for(Cat cat : cats) {
            catsList.add(cat);
        }
        catsList.add(new Cat("Бегемот2"));

        catsList.remove(1);

        Cat cat = catsList.get(0);

        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2,cat);

        catsList.set(2,new Cat("Меня сюда вставили"));

        catsList.removeAll(Arrays.asList(cat,catsList.get(3)));

       System.out.println(catsList.toString());
       System.out.println(catsList.size());



    }
}