package ro.unibuc.map;

import ro.unibuc.model.Person;
import ro.unibuc.comparator.StringComparator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

    public static void main(String[] args) {
        HashMap<String, Person> hashMap = new HashMap<>();
        LinkedHashMap<String, Person> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Person> treeMap = new TreeMap<>();

        treeMap.put("2980506230078", new Person("Maria", 30));
        treeMap.put("2960506230069", new Person("Alin", 23));
        treeMap.put("2950506230063", new Person("Marius", 18));

        hashMap.put("2980506230078", new Person("Maria", 30));
        hashMap.put("2960506230069", new Person("Alin", 23));
        hashMap.put("2950506230063", new Person("Marius", 18));

        linkedHashMap.put("2980506230078", new Person("Maria", 30));
        linkedHashMap.put("2960506230069", new Person("Alin", 23));
        linkedHashMap.put("2950506230063", new Person("Marius", 18));

        System.out.println("HashMap: ");
        for (Map.Entry<String, Person> pair : hashMap.entrySet()) {
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue());
            System.out.println();
        }

        System.out.println("LinkedHashMap: ");
        for (Map.Entry<String, Person> pair : linkedHashMap.entrySet()) {
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue());
            System.out.println();
        }

        System.out.println("TreeMap: ");
        for (Map.Entry<String, Person> pair : treeMap.entrySet()) {
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue());
            System.out.println();
        }

        System.out.println("TreeMap reverse Key order: ");
        TreeMap<String, Person> treeMapWithComparator = new TreeMap<>(new StringComparator());
        treeMapWithComparator.put("2980506230078", new Person("Maria", 30));
        treeMapWithComparator.put("2960506230069", new Person("Alin", 23));
        treeMapWithComparator.put("2950506230063", new Person("Marius", 18));

        for (Map.Entry<String, Person> pair : treeMapWithComparator.entrySet()) {
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue());
            System.out.println();
        }
    }

}
