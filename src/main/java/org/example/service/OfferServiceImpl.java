package org.example.service;

import org.example.entity.Offer;

import java.util.ArrayList;

public interface OfferServiceImpl {
    void addOffer(Offer offer);
    void getOffers();
    void deleteOffer(Offer offer);
    void updateOffer(int id, Offer offer);
    ArrayList<Offer> getOffersArrays();
}
