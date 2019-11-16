package games.ffba.entities;

public class Game {

    private String playerOne;
    private double POScore;
    private String playerTwo;
    private double PTScore;
    private String gameType;
    private int winner;
    private int week;

    public Game(String playerOne, double POScore, String playerTwo, double PTScore, String gameType, int winner, int week) {
        this.playerOne = playerOne;
        this.POScore = POScore;
        this.playerTwo = playerTwo;
        this.PTScore = PTScore;
        this.gameType = gameType;
        this.winner = winner;
        this.week = week;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public double getPOScore() {
        return POScore;
    }

    public void setPOScore(double POScore) {
        this.POScore = POScore;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public double getPTScore() {
        return PTScore;
    }

    public void setPTScore(double PTScore) {
        this.PTScore = PTScore;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
