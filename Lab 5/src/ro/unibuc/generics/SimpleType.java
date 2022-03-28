package ro.unibuc.generics;

import java.util.Arrays;

// The generic type parameter section is delimited by angle brackets (< and >)
class Container<T> { // T − The generic type passed. It can take any Object, and it introduces the type variable 'T' that can be used anywhere inside the class.

    /*
     * The most commonly used type parameter names are:
     *
     *  E - Element (used extensively by the Java Collections Framework)
     *  K - Key
     *  N - Number
     *  T - Type
     *  V - Value
     *  S,U,V etc. - 2nd, 3rd, 4th types
     *
     */

    private T[] items; // Does not compile if class does not specify the generic type <T>

    public Container(T[] items) {
        this.items = items;
    }

    public void addItem(T item) {
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    public T[] getItems() {
        return items;
    }

}

record Itemz(String name) {

}

public class SimpleType {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<String>(new String[]{"First item", "Second item"});
        stringContainer.addItem("Third item");
        stringContainer.addItem("Forth item");

        System.out.println("Items in container: " + Arrays.toString(stringContainer.getItems()));

        Container<Itemz> itemzContainer = new Container<>(new Itemz[]{new Itemz("First item"), new Itemz("Second item")});
        itemzContainer.addItem(new Itemz("Third item"));
        itemzContainer.addItem(new Itemz("Forth item"));

        System.out.println("Items in container: " + Arrays.toString(itemzContainer.getItems()));
    }

}