package ro.unibuc.generics;

interface Pair<K, V> {
    public K getKey();

    public V getValue();
}

class Element<K, V> implements Pair<K, V> {

    private final K key;
    private final V value;

    public Element(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

public class MultipleTypes {

    public static void main(String[] args) {
        Element<Integer, String> firstElement = new Element<>(1, "Value");
        Element<Integer, String> secondElement = new Element<>(2, "String");
        Element<Integer, String> thirdElement = new Element<>(3, "Text");

        Element<Integer, String>[] array = new Element[]{firstElement, secondElement, thirdElement};

        System.out.println("Array contains key 2: " + containsKey(array, 2));
        System.out.println("Array contains value 'Text': " + containsValue(array, "Text"));
    }

    public static <K, V> boolean containsKey(Pair<K, V>[] array, K key) {
        for (Pair<K, V> item : array) {
            if (item.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static <K, V> boolean containsValue(Pair<K, V>[] array, V value) {
        for (Pair<K, V> item : array) {
            if (item.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
