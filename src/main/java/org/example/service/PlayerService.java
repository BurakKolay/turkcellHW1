package org.example.service;

import org.example.entity.Player;

import java.util.ArrayList;

public class PlayerService implements PlayerServiceImpl{

    ArrayList<Player> players= new ArrayList<>();

    @Override
    public String addPlayer(Player player) {
        if(players.contains(player)){
            return "The player is already registered in the system!";
        }
        else {
            players.add(player);
            return player.getFirstName()+" "+player.getLastName()+" is added!";
        }
    }

    @Override
    public void getPlayers() {
        for (Player players:players)
            System.out.println(players);
    }

    @Override
    public String deletePlayer(Player player) {
        if(players.contains(player)){
            players.remove(player);
            return player.getFirstName()+" "+player.getLastName()+" is deleted!";
        }
        else {
            return "Player not found!";
        }
    }

    @Override
    public String updatePlayer(int id, Player player) {
        for(Player player1:players){
            if(player1.getId()==id){
                Player updatedPlayer=player1;
                updatedPlayer.setFirstName(player.getFirstName());
                updatedPlayer.setLastName(player.getLastName());
                updatedPlayer.setIdentityNumber(player.getIdentityNumber());
                players.remove(player1);
                players.add(updatedPlayer);
                return updatedPlayer.getFirstName()+" "+updatedPlayer.getLastName()+" updated!";
            }
        }
        return "Player not found!";
    }
}
