package com.uni.fmi.lab02.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {

    public static void main(String[] args) {

//        Task4
        List<Integer> list = Arrays.asList(1,1121, 321, 1, 5);


        list.sort((i1, i2) ->i1 - i2);

        list.forEach(System.out::println);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Balkan"));
        dogs.add(new Dog("Sharo"));
        dogs.add(new Dog("111"));
        dogs.add(new Dog("Bal32321kan"));
        dogs.add(new Dog("Ba111lkan"));

        dogs.sort(Comparator
                .comparing(Dog::getName));
        dogs.forEach(System.out::println);

//        Task 5
        System.out.println("Task 5");
        replaceSecondElement(dogs, new Dog("Snoopy"));
        dogs.forEach(System.out::println);

//        Task 6

        System.out.println("Count :" + countPairs());

    }

//    Task5
    public static <T> void replaceSecondElement(List<T> list, T element) {
        if (list.size() >= 2) {
            list.set(1, element);
        }
    }
    public static long countPairs() {
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value mappings to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

//        map.size();
        return map.entrySet().stream().count();

    }

}
