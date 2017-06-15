package com.edu.firstSpringBootApp.dao;

import java.util.List;

import com.edu.firstSpringBootApp.team.Team;



public interface ITeamDao {
	
	
	public abstract List<Team> getAll();

	public abstract void add(Team team);

	public abstract Team get(int id);

	public abstract boolean update(Team team);

	public abstract void delete(int teamKey);


}
