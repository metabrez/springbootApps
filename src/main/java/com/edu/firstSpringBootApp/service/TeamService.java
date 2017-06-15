package com.edu.firstSpringBootApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.firstSpringBootApp.dao.TeamDao;
import com.edu.firstSpringBootApp.team.Team;

@Service
public class TeamService implements ITeamService {
	
	@Autowired
	private TeamDao teamDao;

	@Override
	public List<Team> getAll() {
		
		return teamDao.getAll();
	}

	@Override
	public void add(Team team) {
		
		teamDao.add(team);
		
	}

	@Override
	public Team get(int id) {
		return teamDao.get(id);
		
	}

	@Override
	public boolean update(int teamKey, Team team) {
		team.setTeamKey(teamKey);
		return teamDao.update(team);
		
	}

	@Override
	public void delete(int teamKey) {
		
		teamDao.delete(teamKey);
		
	}

}
