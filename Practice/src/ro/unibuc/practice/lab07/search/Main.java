package ro.unibuc.practice.lab07.search;

public class Main {

    public static void main(String[] args) {
        SearchEngine searchEngine = new FileSearchEngine();
        searchEngine.start();
        searchEngine.search();
        searchEngine.displayResults();
    }

}
