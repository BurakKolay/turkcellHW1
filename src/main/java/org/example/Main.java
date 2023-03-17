package org.example;

import org.example.entity.Game;
import org.example.entity.Offer;
import org.example.entity.Player;
import org.example.service.*;


public class Main {
    public static void main(String[] args) {
        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        Player player1 = new Player(1,"24506223362","Burak","Kolay","28.04.1999",null);
        Player player2 = new Player(2,"24506223362","Burak","Kolay","28.04.1999",null);
        Player player3 = new Player(3,"55506223362","Burak","Yeni","28.04.1999",null);
        Game game1= new Game(1,"Elden Ring",200,"GOTY 2023");
        Game game2= new Game(2,"RDR2",100,"GOTY 2017");
        Offer offer1= new Offer(1,20,game1);
        Offer offer2= new Offer(2,10,game2);
        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        PlayerServiceImpl playerService = new PlayerService();
        playerService.addPlayer(player1);
        playerService.addPlayer(player2);
        playerService.addPlayer(player3);
        playerService.deletePlayer(player2);
        playerService.updatePlayer(3,new Player(3,"55506223362","Degisti","Soyad","28.04.1999",null));
        playerService.getPlayers();
        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        OfferServiceImpl offerService = new OfferService();
        offerService.addOffer(offer1);
        offerService.addOffer(offer2);
        offerService.getOffers();
        offerService.deleteOffer(offer2);
        offerService.updateOffer(1,new Offer(1,50,game1));
        offerService.getOffers();
        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        SalesServiceImpl salesService = new SalesService(offerService);
        salesService.sell(game1,player1);
        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        playerService.getPlayers();
    }
}