package ro.unibuc.practice.lab07.search;

import java.util.Scanner;

public class FileSearchEngine implements SearchEngine {

    private final Scanner scanner;
    private String wordToSearchFor;

    public FileSearchEngine() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("What word would you like to search for?");
        wordToSearchFor = scanner.nextLine();

        System.out.println("Searching for: " + wordToSearchFor);
    }

    @Override
    public void search() {
        // TODO: Parse files from 'Resources\Lab 07\Search' and store results in a separate variable
    }

    @Override
    public void displayResults() {
        // TODO: Display results based on search results
    }

}
