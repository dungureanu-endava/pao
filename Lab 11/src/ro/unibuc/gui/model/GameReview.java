package ro.unibuc.gui.model;

public class GameReview {

    private Long id;
    private String game;
    private Double score;
    private GameType type;
    private String developer;

    public GameReview() {
    }

    public GameReview(String game, double score, GameType type, String developer) {
        this.game = game;
        this.score = score;
        this.type = type;
        this.developer = developer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public GameType getType() {
        return type;
    }

    public void setType(GameType type) {
        this.type = type;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Object[] getArray() {
        return new Object[]{game, score, type, developer};
    }

    @Override
    public String toString() {
        return "Game: " + game +
                " \nScore: " + score +
                " \nType: " + type +
                " \nDeveloper: " + developer;
    }
}
