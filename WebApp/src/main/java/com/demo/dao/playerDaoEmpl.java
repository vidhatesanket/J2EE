package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.player;

@Repository
public class playerDaoEmpl implements playerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<player> getAllPlayers() {
		return jdbcTemplate.query("select * from player", (rs,num)->{
			player p=new player();
			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setSkills(rs.getString(3));
			return p;
		});
	}

	
}
