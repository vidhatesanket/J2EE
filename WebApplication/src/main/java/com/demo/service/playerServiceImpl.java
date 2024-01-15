package com.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.playerDao;
import com.demo.model.player;

@Service
public class playerServiceImpl implements playerService{
	@Autowired
	private playerDao pdao;
	@Override
	public List<player> getAll() {
		return pdao.getAllPlayers();
	}
	@Override
	public void delete(int id) {
		pdao.deletePlayer(id);
		
	}
	@Override
	public void addNew(player p) {
		pdao.addNewPlayer(p);
		
	}
	@Override
	public player editPlayer(int id) {
		return pdao.editPlayerInfo(id);
	}
	@Override
	public void updateinfo(player p) {
		pdao.updateInfo(p);
		
	}

}
