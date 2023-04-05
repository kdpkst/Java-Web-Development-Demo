package com.cpt202.team.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpt202.team.Models.Team;


// Spring Annotation
@RestController
@RequestMapping("/team")
public class TeamController {

    private List<Team> teams = new ArrayList<>();
    
    @GetMapping("/list")    
    public String getList(){
        return "a list of team";
    }

    @PostMapping("/add")
    public void addTeam(@RequestBody Team t){
        teams.add(t);
    }

    
    
}
