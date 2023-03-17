package org.example.entity;

public class Offer {
    private int id;
    private double discountAmount;
    private Game game;

    public Offer(int id, double discountAmount, Game game) {
        this.id = id;
        this.discountAmount = discountAmount;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", discountAmount=" + discountAmount +
                ", game=" + game +
                '}';
    }
}
