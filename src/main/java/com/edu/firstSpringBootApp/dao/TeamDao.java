package com.edu.firstSpringBootApp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.edu.firstSpringBootApp.team.Team;

@Repository
public class TeamDao implements ITeamDao {

	//private List<Team> listTeam2 = new ArrayList<>();
	
	private List<Team> listTeam = new CopyOnWriteArrayList<>();

	public TeamDao() {
		Team t1 = new Team(1, "Tabrez", "Kathmandu", "mascot", "Red", "Green");
		Team t2 = new Team(2, "Nagendra", "Dharan", "mascot", "Red", "Green");
		Team t3 = new Team(3, "Anish", "Butawal", "mascot", "Red", "Green");

		listTeam.add(t1);
		listTeam.add(t2);
		listTeam.add(t3);
	}

	@Override
	public List<Team> getAll() {

		return listTeam;
	}

	@Override
	public void add(Team team) {

		listTeam.add(team);

	}

	@Override
	public Team get(int id) {

		for (Team t : listTeam) {

			if (t.getTeamKey() == id) {

				return t;
			}
		}
		return null;
	}

	@Override
	public boolean update(Team team) {

		for (int i = 0; i < listTeam.size(); i++) {
			if (team.getTeamKey() == listTeam.get(i).getTeamKey()) {
				listTeam.get(i).setCity(team.getCity());
				listTeam.get(i).setHomeUniform(team.getHomeUniform());
				listTeam.get(i).setMascot(team.getMascot());
				listTeam.get(i).setMatchesAsHome(team.getMatchesAsHome());
				listTeam.get(i).setMatchesAsVisitor(team.getMatchesAsVisitor());

				listTeam.get(i).setName(team.getName());
				listTeam.get(i).setPlayers(team.getPlayers());
				listTeam.get(i).setVisitUniform(team.getVisitUniform());
				return true;
			}
			;

		}

		return false;
	}

	@Override
	public void delete(int teamkey) {
		for (Team t : listTeam) {
			if (t.getTeamKey() == teamkey) {
				listTeam.remove(teamkey);
			}
		}

	}

}
