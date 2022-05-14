package ro.unibuc.jdbc.service;

import ro.unibuc.jdbc.model.GameReview;
import ro.unibuc.jdbc.model.GameType;
import ro.unibuc.jdbc.repository.GameReviewRepository;

public class SiteService {

    private final GameReviewRepository repository;

    public SiteService() {
        this.repository = new GameReviewRepository();
    }

    public void setup() {
        repository.createTable();
    }

    public void loadData() {
        repository.addReview(new GameReview("LOOT RIVER", 7.7, GameType.RPG, "Straka Studio"));
        repository.addReview(new GameReview("NORCO", 7.5, GameType.ADVENTURE, "Geography of Robots"));
        repository.addReview(new GameReview("TUNIC", 7.7, GameType.ACTION, "ISOMETRICORP Games"));
        repository.addReview(new GameReview("ELDEN RING", 9.4, GameType.RPG, "From Software"));
        repository.addReview(new GameReview("ROGUE LEGACY 2", 9.0, GameType.ACTION, "Cellar Door Games"));
        repository.addReview(new GameReview("IRON LUNG", 9.3, GameType.ADVENTURE, "David Szymanski"));
    }

    public void clean() {
        repository.dropTable();
    }

}
