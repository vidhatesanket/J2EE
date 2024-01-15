package com.demo.service;

import java.util.List;

import com.demo.model.player;

public interface playerService {

	List<player> getAll();

	void delete(int id);

	void addNew(player p);

	player editPlayer(int id);

	void updateinfo(player p);

}
