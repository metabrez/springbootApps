package com.edu.firstSpringBootApp.service;

import com.edu.firstSpringBootApp.team.Stadium;

public interface IStadiumService {
	
	
	public abstract void add(Stadium stadium);

	public abstract Stadium get(int stadiumKey);

	public abstract void update(int stadiumKey, Stadium stadium);

	public abstract void delete(int stadiumKey);

}
