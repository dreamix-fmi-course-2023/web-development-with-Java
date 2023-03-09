package com.fmi.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.fmi.streams.Item;

public class CollectionMain {

    public static void main(String[] args) {
        Set<Item> set = new TreeSet<>((Item o1, Item o2) ->{
            return o1.getPrice().compareTo(o2.getPrice());
        }
        );
    }
}
