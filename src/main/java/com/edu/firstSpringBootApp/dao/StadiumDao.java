package com.edu.firstSpringBootApp.dao;

import java.util.HashMap;
import java.util.Map;

import com.edu.firstSpringBootApp.team.Stadium;



public class StadiumDao implements IStadiumDao{
	private Map<Integer, Stadium> stadium = new HashMap<>();

	@Override
	public void add(Stadium stadium) {
		
		
		
	}

	@Override
	public Stadium get(int stadiumKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int stadiumKey, Stadium stadium) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int stadiumKey) {
		// TODO Auto-generated method stub
		
	}

}
