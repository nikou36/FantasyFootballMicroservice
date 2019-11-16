package games.ffba.dao;

import games.ffba.entities.Game;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;

@Repository
public class SQLDao {

    private ArrayList<Game> games;

    //Gathers game data from MySql DB
    public SQLDao() throws SQLException {
        this.games = new ArrayList<Game>();
        ResultSet rs = getDb();
        while(rs.next()) {
            games.add(new Game(rs.getString("Player_One"),rs.getDouble("Player_One_Score"),rs.getString("Player_Two"),
                    rs.getDouble("Player_Two_Score"),rs.getString("Game_Type"),rs.getInt("Winner"),rs.getInt("Week")));
        }
    }

    public ArrayList<Game> getAll() {
        return games;
    }

    //Adds new game data to the MySql DB
    public void put(Game game) {
        String PO = game.getPlayerOne();
        Double POS = game.getPOScore();
        String PT = game.getPlayerTwo();
        Double PTS = game.getPTScore();
        String GT = game.getGameType();
        int winner = game.getWinner();
        int week = game.getWeek();
        String url = "jdbc:mysql://localhost:3306/participants";
        String user = "root";
        String password = "Seattle123!";
        try {
            Connection myconn = DriverManager.getConnection(url,user,password);
            Statement myStatement = myconn.createStatement();
            String sql = "INSERT INTO participants.games values(" +PO + "," +POS+","+PT+","+PTS+","+GT+","+winner+","+week+")";
            myStatement.execute(sql);
        }catch(SQLException e) {

        }
    }

    //Connects to MySql DB and extracts game data.
    private ResultSet getDb() {
        String url = "jdbc:mysql://localhost:3306/participants";
        String user = "root";
        String password = "Seattle123!";
        ResultSet rs = null;
        try {
            Connection myconn = DriverManager.getConnection(url,user,password);
            Statement myStatement = myconn.createStatement();
            String sql = "SELECT * FROM participants.games";
            rs = myStatement.executeQuery(sql);
        }catch(SQLException e) {

        }
        return rs;
    }

}
