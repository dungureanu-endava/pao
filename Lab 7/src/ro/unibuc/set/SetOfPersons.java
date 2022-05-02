package ro.unibuc.set;

import ro.unibuc.model.Person;

import java.util.*;

public class SetOfPersons {

    public static void main(String[] args) {
        Set<Person> set = new LinkedHashSet<>();
        Person p1 = new Person("Popescu Ion", 23);
        Person p2 = new Person("Popescu Ionut", 12);

        System.out.println(set.add(p1));
        System.out.println(set.add(p1));
        System.out.println(set.add(p2));

        System.out.println(set);

        Set<Person> treeSet = new TreeSet<>();

        System.out.println(treeSet.add(p1));
        System.out.println(treeSet.add(p2));

        System.out.println(treeSet);
    }

}
