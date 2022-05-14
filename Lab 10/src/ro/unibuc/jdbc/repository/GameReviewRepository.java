package ro.unibuc.jdbc.repository;

import ro.unibuc.jdbc.config.DatabaseConnection;
import ro.unibuc.jdbc.model.GameReview;
import ro.unibuc.jdbc.model.GameType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class GameReviewRepository {

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS game_review " +
                "(id SERIAL PRIMARY KEY, " +
                "game VARCHAR(50)," +
                "score REAL," +
                "type VARCHAR(20)," +
                "developer VARCHAR(50))";

        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(sql);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void addReview(GameReview gameReview) {
        String sql = "INSERT INTO game_review (game, score, type, developer) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            preparedStatement.setString(1, gameReview.getGame());
            preparedStatement.setDouble(2, gameReview.getScore());
            preparedStatement.setString(3, gameReview.getType().toString());
            preparedStatement.setString(4, gameReview.getDeveloper());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public List<GameReview> getAllReviews() {
        String sql = "SELECT * FROM game_review";
        List<GameReview> gameReviews = new ArrayList<>();

        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                GameReview gameReview = new GameReview();

                gameReview.setId(resultSet.getLong(1));
                gameReview.setGame(resultSet.getString(2));
                gameReview.setScore(resultSet.getDouble(3));
                gameReview.setType(GameType.valueOf(resultSet.getString(4)));
                gameReview.setDeveloper(resultSet.getString(5));

                gameReviews.add(gameReview);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return gameReviews;
    }

    public Optional<GameReview> getGameReview(String game) {
        String sql = "SELECT * FROM game_review gr WHERE gr.game LIKE ?";

        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            preparedStatement.setString(1, game);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                GameReview gameReview = new GameReview();

                gameReview.setId(resultSet.getLong("id"));
                gameReview.setGame(resultSet.getString("game"));
                gameReview.setScore(resultSet.getDouble("score"));
                gameReview.setType(GameType.valueOf(resultSet.getString("type")));
                gameReview.setDeveloper(resultSet.getString("developer"));

                return Optional.of(gameReview);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return Optional.empty();
    }

    public void dropTable() {
        String sql = "DROP TABLE IF EXISTS game_review";

        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(sql);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}