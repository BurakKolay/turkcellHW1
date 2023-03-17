package org.example.service;

import org.example.entity.Offer;

import java.util.ArrayList;

public class OfferService implements OfferServiceImpl{
    ArrayList<Offer> offers=new ArrayList<>();
    @Override
    public void addOffer(Offer offer) {
        if(offers.contains(offer))
            System.out.println("The offer is already added in the system");
        else {
            offers.add(offer);
            System.out.println("This offer added to system");
        }
    }

    @Override
    public void getOffers() {
        for(Offer offer:offers){
            System.out.println(offer);
        }
    }

    @Override
    public void deleteOffer(Offer offer) {
        if(offers.contains(offer)){
            offers.remove(offer);
            System.out.println("This offer deleted in the system");
        }else {
            System.out.println("This offer didn't found.");
        }
    }

    @Override
    public void updateOffer(int id, Offer offer) {
        for(Offer offer1:offers){
            if(offer1.getId()==id){
                Offer updatedOffer=offer1;
                updatedOffer.setDiscountAmount(offer.getDiscountAmount());
                offers.remove(offer1);
                offers.add(updatedOffer);
                System.out.println("Offer updated!");
            }
        }
    }

    @Override
    public ArrayList<Offer> getOffersArrays() {
        return offers;
    }


}
