package com.demo.dao;

import java.util.List;

import com.demo.model.player;

public interface playerDao {

	List<player> getAllPlayers();

	void deletePlayer(int id);

	void addNewPlayer(player p);

	player editPlayerInfo(int id);

	void updateInfo(player p);

}
