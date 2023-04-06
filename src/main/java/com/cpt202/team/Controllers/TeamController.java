package com.cpt202.team.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpt202.team.Models.Team;
import com.cpt202.team.Services.TeamService;


// Spring Annotation
@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/list")    
    public List<Team> getList(){
        return teamService.getTeamList();
    }

    @PostMapping("/add")
    public Team addTeam(@RequestBody Team t){
        return teamService.addTeam(t);
    }

    
    
}
