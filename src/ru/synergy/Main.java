package ru.synergy;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    //Arrays

        Cat [] cats = new Cat[4];
        cats[0] = new  Cat("Томас");
        cats[1] = new  Cat("Бегемот");
        cats[2] = new  Cat("Филип Маркович");
        cats[3] = new  Cat("Котяра");

        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

        //ArraysList

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

    //LinkedList

        String str1 = new String("Hello World");
        String str2 = new String("My name is Artem");
        String str3 = new String("I love Java");

        LinkedList<String> artemBio = new LinkedList<>();
        artemBio.add(str1);
        artemBio.add(str2);
        artemBio.add(str3);

        System.out.println(artemBio);
        artemBio.remove(1);
        System.out.println(artemBio);

        //LinkedList on practice

        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari Spider");
        Car bugatti = new Car("Veyron");
        Car mercedes = new Car("Mercedes Benz");

        cars.addAll(Arrays.asList(ferrari, bugatti, mercedes));

        System.out.println(cars);

        cars.addFirst(new Car("Ford dt300"));
        cars.addLast(new Car("Fiat"));

        System.out.println(cars);

        System.out.println(cars.pollFirst());

        System.out.println(cars);

        // ArrayList vs LinkedList

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i< 5000000; i++){
            list.add(new Integer(i));
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i<100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для LinkedList в миллисекундах " + (System.currentTimeMillis()-start));

        list = new ArrayList<>();
        for (int i = 0; i< 5000000; i++){
            list.add(new Integer(i));
        }
        start = System.currentTimeMillis();

        for (int i = 0; i<100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для ArrayList в миллисекундах " + (System.currentTimeMillis()-start));



    }
}