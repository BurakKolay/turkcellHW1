package org.example.entity;

public class Player {
    private int id;
    private String identityNumber;
    private String firstName;
    private String lastName;
    private String birthDay;
    private Game game;

    public Player(int id, String identityNumber, String firstName, String lastName, String birthDay, Game game) {
        this.id = id;
        this.identityNumber = identityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String  getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String  birthDay) {
        this.birthDay = birthDay;
    }

    public Game getGames() {
        return game;
    }

    public void setGames(Game games) {
        this.game = games;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", identityNumber='" + identityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", game=" + game +
                '}';
    }
}
