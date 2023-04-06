package com.cpt202.team.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpt202.team.Models.Team;


public interface TeamRepo extends JpaRepository<Team, Integer> { 
}
