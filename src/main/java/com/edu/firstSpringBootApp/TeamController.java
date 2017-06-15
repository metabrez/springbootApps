package com.edu.firstSpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edu.firstSpringBootApp.service.TeamService;
import com.edu.firstSpringBootApp.team.Team;

@Controller
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "/teams", method = RequestMethod.GET)
	public String getAll(Model model) {

		List<Team> list = teamService.getAll();
		model.addAttribute("teamListKey", list);
		return "teamList";

	}

	@RequestMapping(value = "/teams", method = RequestMethod.POST)
	public String addTeam(Team team) {

		teamService.add(team);
		return "redirect:/teams";
	}

	@RequestMapping(value = "/teams/{id}", method = RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		if (teamService.get(id) == null) {
			return "error";
		}
		model.addAttribute("team", teamService.get(id));

		return "teamDetails";

	}

	@RequestMapping(value = "/teams/{id}", method = RequestMethod.POST)
	public String update(@PathVariable int id, Team team) {

		if (teamService.update(id, team) == true) {
			return "redirect:/teams";
		} else{
			return "error";
		}
	}
		@RequestMapping(value="teams/delete",method=RequestMethod.POST)
		public String delete(int teamKey){
			teamService.delete(teamKey);
			return "redirect:/teams";
		}
	}


