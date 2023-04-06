package com.cpt202.team.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpt202.team.Models.Team;
import com.cpt202.team.Repositories.TeamRepo;

@Service
public class TeamService {

    @Autowired
    private TeamRepo teamRepo;
    
    public Team addTeam(Team team){
        return teamRepo.save(team);
    }

    public List<Team> getTeamList(){
        return teamRepo.findAll();
    }
    
}
