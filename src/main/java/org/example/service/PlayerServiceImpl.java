package org.example.service;

import org.example.entity.Player;

import java.util.ArrayList;

public interface PlayerServiceImpl {

    String addPlayer(Player player);
    void getPlayers();
    String deletePlayer(Player player);
    String updatePlayer(int id,Player player);
}
