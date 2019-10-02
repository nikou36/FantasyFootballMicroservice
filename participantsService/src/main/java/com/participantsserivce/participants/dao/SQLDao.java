package com.participantsserivce.participants.dao;

import com.participantsserivce.participants.entities.Participant;
import org.springframework.stereotype.Repository;

import javax.xml.transform.Result;
import java.sql.*;

import java.util.Collection;
import java.util.HashMap;

/*
Connects to the SQL database and creates a repository of participant data.
 */

@Repository
public class SQLDao {

    private HashMap<Integer,Participant> participants;//<ID, Participant info>

    //Connects to the participant SQL database and creates a repository from the extracted data
    public SQLDao() throws SQLException {
        participants = new HashMap<Integer, Participant>();
        ResultSet rs = getDb();
        int id = 1;
        while(rs.next()) {
            participants.put(id, new Participant(rs.getString("Name"),Integer.parseInt(rs.getString("Year")),rs.getString("Rank")));
            id++;
        }
    }

    //Returns information of all participants
    public Collection<Participant> getAll() {
        return participants.values();
    }

    //Accesses the SQL database and returns the ResultSet.
    private ResultSet getDb() {
        String url = "jdbc:mysql://localhost:3306/participants";
        String user = "root";
        String password = "Seattle123!";
        ResultSet rs = null;
        try {
            Connection myconn = DriverManager.getConnection(url,user,password);
            Statement mystatement = myconn.createStatement();
            String sql = "SELECT * FROM participants.participants";
            rs = mystatement.executeQuery(sql);

        }catch (SQLException e) {

        }
        return rs;
    }

}
