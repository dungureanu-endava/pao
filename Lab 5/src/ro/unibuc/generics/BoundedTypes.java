package ro.unibuc.generics;

import java.util.ArrayList;
import java.util.List;

interface Sliceable {
    public String getSlice();
}

class Pizza implements Sliceable {
    protected String type = "Classic Pizza";

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public String getSlice() {
        return "One slice of " + type;
    }
}

class ItalianPizza extends Pizza {
    public ItalianPizza() {
        type = "Italian Pizza";
    }
}

class SicilianPizza extends ItalianPizza {
    public SicilianPizza() {
        type = "Sicilian Pizza";
    }
}

class TexasBBQPizza extends Pizza {
    public TexasBBQPizza() {
        type = "Texas BBQ Pizza";
    }
}

public class BoundedTypes {

    public static void main(String[] args) {
        pizzaMenu(new Pizza[]{new SicilianPizza(), new TexasBBQPizza(), new Pizza()});

        getASlice(new ItalianPizza());
        getASlice2(new ItalianPizza());

        List<? super ItalianPizza> lowerBoundPizzaList = new ArrayList<>();
        lowerBoundPizzaList.add(new SicilianPizza());
        lowerBoundPizzaList.add(new ItalianPizza());
        // lowerBoundPizzaList.add(new Pizza());
        // lowerBoundPizzaList.add(new TexasBBQPizza());
        System.out.println(lowerBoundPizzaList.toString());
    }

    public static <T extends Pizza> void pizzaMenu(T[] pizzaArray) {
        System.out.println("Our types of pizza:");
        for (T t : pizzaArray) {
            System.out.println(t.getType());
        }
    }

    public static void getASlice2(Sliceable sliceable) {
        System.out.println(sliceable.getSlice());
    }

    public static <T extends Sliceable> void getASlice(T sliceable) {
        System.out.println(sliceable.getSlice());
    }
}
