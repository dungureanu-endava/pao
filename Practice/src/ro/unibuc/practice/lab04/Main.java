package ro.unibuc.practice.lab04;

public class Main {
    public static void main(String[] args) {
        String text = "Priusquam rem Suo credendas";
        String palindrome = "sadnedercousmermauqsuirp";

        StringBuilder builder = new StringBuilder(text);
        builder.reverse();

        System.out.println("Is the text a palindrome: " + palindrome.equalsIgnoreCase(builder.toString().replaceAll(" ", "")));
    }
}
