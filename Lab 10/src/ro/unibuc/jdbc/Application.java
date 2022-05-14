package ro.unibuc.jdbc;


import ro.unibuc.jdbc.model.GameReview;
import ro.unibuc.jdbc.model.GameType;
import ro.unibuc.jdbc.service.GameReviewsService;
import ro.unibuc.jdbc.service.SiteService;

import java.util.Optional;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        load();
        run();
        clean();
    }

    public static void load() {
        SiteService service = new SiteService();

        service.setup();
        service.loadData();
    }

    public static void run() {
        GameReviewsService service = new GameReviewsService();

        Scanner scanner = new Scanner(System.in);

        INFINITE_LOOP:
        while (true) {
            System.out.println("Please type one of the following commands: create, get, get all, exit");
            String command = scanner.nextLine().toLowerCase();
            switch (command) {
                case "create" -> create(service, scanner);

                case "get" -> get(service, scanner);

                case "get all" -> getAll(service);

                case "exit" -> {
                    System.out.println("\nHave a nice day!");
                    break INFINITE_LOOP;
                }

                default -> System.out.printf("\nNo operation found for command %s. \n", command);
            }
        }
    }

    private static void create(GameReviewsService service, Scanner scanner) {
        System.out.println();

        System.out.println("Please specify the review details: ");
        GameReview gameReview = new GameReview();

        System.out.print(" - Game name: ");
        gameReview.setGame(scanner.nextLine().toUpperCase());

        System.out.print(" - Game type: ");
        gameReview.setType(GameType.valueOf(scanner.nextLine().toUpperCase()));

        System.out.print(" - Review score: ");
        gameReview.setScore(Double.valueOf(scanner.nextLine()));

        System.out.print(" - Game developer: ");
        gameReview.setDeveloper(scanner.nextLine());

        service.addGameReview(gameReview);
        System.out.println("Review saved");

        System.out.println();
    }

    private static void get(GameReviewsService service, Scanner scanner) {
        System.out.println();

        System.out.print("Please specify the game: ");
        String game = scanner.nextLine().toUpperCase();

        Optional<GameReview> gameReview = service.getReviewByGame(game);
        if (gameReview.isPresent()) {
            System.out.println(gameReview.get());
        } else {
            System.out.printf("No review found for game %s \n", game);
        }

        System.out.println();
    }

    private static void getAll(GameReviewsService service) {
        System.out.println();

        System.out.printf("%20s  %-5s   %10s   %25s \n", "Game", "Score", "Type", "Developer");
        service.getAllReviews().forEach(gameReview -> System.out.printf("%20s  %-5s   %10s   %25s \n", gameReview.getGame(), gameReview.getScore(), gameReview.getType(), gameReview.getDeveloper()));

        System.out.println();
    }

    public static void clean() {
        SiteService service = new SiteService();

        service.clean();
    }
}
