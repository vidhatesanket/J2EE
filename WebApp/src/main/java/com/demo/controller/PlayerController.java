package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.player;
import com.demo.service.playerService;

@Controller
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	private playerService pserv;
	@GetMapping("/getplayers")
	public ModelAndView getProducts() {
		List<player> plist=pserv.getAll();
		return new ModelAndView("displayplayer","plist",plist);
	}


	
}
