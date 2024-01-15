package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.player;

@Repository
public class playerDaoEmpl implements playerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<player> getAllPlayers() {
		List<player> lst= jdbcTemplate.query("select * from playerlist", (rs,num)->{
			player p=new player();
			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setSkills(rs.getString(3));
			return p;
		});
		return lst;
	}
	@Override
	public void deletePlayer(int id) {
		jdbcTemplate.update("delete from playerlist where pid=?", new Object[] {id});
		
	}
	
	@Override
	public void addNewPlayer(player p) {
		jdbcTemplate.update("insert into playerlist values(?,?,?)",
				new Object[] {p.getPid(),p.getName(),p.getSkills()});
		
	}
	@Override
	public player editPlayerInfo(int id) {
		return jdbcTemplate.queryForObject("Select * from playerlist where pid=?", new Object[]{id},BeanPropertyRowMapper.newInstance(player.class));
		
	}
	@Override
	public void updateInfo(player p) {
		jdbcTemplate.update("update playerlist set pname=?,skills=? where pid=?",
				new Object[] {p.getName(),p.getSkills(),p.getPid()});
		
		
	}

	
}
