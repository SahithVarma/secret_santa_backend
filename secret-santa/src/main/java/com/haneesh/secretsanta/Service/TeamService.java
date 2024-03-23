package com.haneesh.secretsanta.Service;

import com.haneesh.secretsanta.Model.Team;
import com.haneesh.secretsanta.Repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeamService {

    @Autowired
    TeamRepo teamrepo;


    public String createTeam(Team team) {


        try {

            teamrepo.save(team);
        }
        catch(Exception e){
            return "failed";
        }
        return "success";
    }

    public Team getTeam(String code) {
        return teamrepo.findByUniqueCode(code);
    }


}
