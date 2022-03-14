package ro.unibuc.practice.lab04;

import java.util.Arrays;

public record Book(String author, String title, Page[] pages) {

    public void printBook() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: ");
        Arrays.stream(pages).forEach(System.out::println);
    }

}
