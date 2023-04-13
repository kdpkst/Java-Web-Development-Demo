package com.cpt202.team.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int memberCount;
    

    public Team() {
    }

    
    public Team(int id, String name, int memberCount) {
        this.id = id;
        this.name = name;
        this.memberCount = memberCount;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMemberCount() {
        return memberCount;
    }
    
    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    


}
