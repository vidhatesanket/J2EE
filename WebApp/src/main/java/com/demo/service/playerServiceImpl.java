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

}
