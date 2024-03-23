package com.haneesh.secretsanta.Controller;

import com.haneesh.secretsanta.Model.Team;
import com.haneesh.secretsanta.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TeamController {
    @Autowired
    TeamService service;

    @PostMapping("/createTeam")
    public String createTeam(@RequestBody Team team){
        return service.createTeam(team);

    }
    @GetMapping("/getteaminfo/{code}")
    public Team getTeam(@PathVariable String code){
        return service.getTeam(code);

    }



}
