package com.participantsserivce.participants.entities;

/*
An Entity class to house the information for the fantasy football managers
of a certain season.
 */
public class Participant {

    private String name;// Manager name
    private int year;//Year they participated
    private String rank;//Rank in final standings
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Participant(String name, int year, String rank, String team) {
        this.name = name;
        this.year = year;
        this.rank = rank;
        this.teamName = team;
    }

    public Participant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
