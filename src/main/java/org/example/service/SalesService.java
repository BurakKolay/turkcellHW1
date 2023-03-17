package org.example.service;

import org.example.entity.Game;
import org.example.entity.Offer;
import org.example.entity.Player;

public class SalesService implements SalesServiceImpl{
    private final OfferServiceImpl offerService;

    public SalesService(OfferServiceImpl offerService) {
        this.offerService = offerService;
    }

    @Override
    public void sell(Game game, Player player) {
        for(Offer offer:offerService.getOffersArrays()){
            if (offer.getGame().equals(game)){
                game.setCost(game.getCost()-(game.getCost())*offer.getDiscountAmount()/100);
                System.out.println("This Game's new cost is: "+game.getCost());
                player.setGames(game);
                System.out.println("This Game selled to "+player.getFirstName()+" "+player.getLastName());
            }
        }
    }
}
