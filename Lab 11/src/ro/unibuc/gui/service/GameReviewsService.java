package ro.unibuc.gui.service;

import ro.unibuc.gui.model.GameReview;
import ro.unibuc.gui.repository.GameReviewRepository;

import java.util.List;
import java.util.Optional;

public class GameReviewsService {

    private final GameReviewRepository repository;

    public GameReviewsService() {
        this.repository = new GameReviewRepository();
    }

    public void addGameReview(GameReview gameReview) {
        repository.addReview(gameReview);
    }

    public Optional<GameReview> getReviewByGame(String game) {
        return repository.getGameReview(game);
    }

    public List<GameReview> getAllReviews() {
        return repository.getAllReviews();
    }

}
