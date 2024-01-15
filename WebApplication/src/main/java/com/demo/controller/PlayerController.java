package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.player;
import com.demo.service.playerService;

@Controller
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	private playerService pserv;
	@GetMapping("/getplayers")
	public ModelAndView getPlayers() {
		List<player> plist=pserv.getAll();
		return new ModelAndView("displayplayer","plist",plist);
	}
	@GetMapping("/delete/{id}")
	public ModelAndView deletePlayers(@PathVariable int id) {
		pserv.delete(id);
		return new ModelAndView("redirect:/player/getplayers");
	}
	@RequestMapping("addPlayerForm")
	public String addPlayerForm() {
		return "insertplayerinfo";
	}
	@GetMapping("/addplayer")
	public ModelAndView addNewPlayer(@RequestParam int pid,@RequestParam String pname,@RequestParam String pskills) {
		player p=new player(pid,pname,pskills);
		pserv.addNew(p);
		return new ModelAndView("redirect:/player/getplayers");
	}
	@GetMapping("/edit/{id}")
	public ModelAndView editPlayer(@PathVariable int id) {
		player p=pserv.editPlayer(id);
		System.out.println(p);
		return new ModelAndView("editForm","p1",p);
	}
	@GetMapping("editPlayerInfo")
	public ModelAndView updatePlayer(@RequestParam int pid,@RequestParam String pname,@RequestParam String pskills) {
		player p=new player(pid,pname,pskills);
		pserv.updateinfo(p);
		return new ModelAndView("redirect:/player/getplayers");
	}
	
	
}
