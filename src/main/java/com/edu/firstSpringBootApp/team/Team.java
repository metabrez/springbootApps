package com.edu.firstSpringBootApp.team;

import java.util.List;

public class Team {

	private int teamKey;
	private String name;
	private String city;
	private String mascot;
	private String homeUniform;
	private String visitUniform;

	private List<Player> players;

	private List<Match> matchesAsHome;
	private List<Match> matchesAsVisitor;

	public Team() {

	}

	public Team(int key, String name, String city, String mascot, String homeUniform, String visitUniform) {
		this.teamKey = key;
		this.name = name;
		this.city = city;
		this.mascot = mascot;
		this.homeUniform = homeUniform;
		this.visitUniform = visitUniform;
	}

	public int getTeamKey() {
		return teamKey;
	}

	public void setTeamKey(int teamKey) {
		this.teamKey = teamKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMascot() {
		return mascot;
	}

	public void setMascot(String mascot) {
		this.mascot = mascot;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String getHomeUniform() {
		return homeUniform;
	}

	public void setHomeUniform(String homeUniform) {
		this.homeUniform = homeUniform;
	}

	public String getVisitUniform() {
		return visitUniform;
	}

	public void setVisitUniform(String visitUniform) {
		this.visitUniform = visitUniform;
	}

	public List<Match> getMatchesAsHome() {
		return matchesAsHome;
	}

	public void setMatchesAsHome(List<Match> matchesAsHome) {
		this.matchesAsHome = matchesAsHome;
	}

	public List<Match> getMatchesAsVisitor() {
		return matchesAsVisitor;
	}

	public void setMatchesAsVisitor(List<Match> matchesAsVisitor) {
		this.matchesAsVisitor = matchesAsVisitor;
	}

}
