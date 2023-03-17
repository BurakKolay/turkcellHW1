package org.example.entity;

public class Game {
    private int id;
    private String gameName;
    private double cost;
    private String title;


    public Game(int id, String gameName, double cost, String title) {
        this.id = id;
        this.gameName = gameName;
        this.cost = cost;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }
}
