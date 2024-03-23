package com.haneesh.secretsanta.Controller;

import com.haneesh.secretsanta.Model.Santa;
import com.haneesh.secretsanta.Service.SantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("santa")
public class SantaController {
    @Autowired
    SantaService service;
    @RequestMapping("getAllSecretSanta/{code}")
    public List<Santa> getAllSantasAndChilds(@PathVariable String code){
        return service.getAllSantasAndChilds(code);
    }
    @PostMapping("generate/{code}")
    public String generateSecretSanta(@PathVariable String code){
        return service.generateSecretSanta(code);
    }
    @GetMapping("getChildForSanta/{santa}/{code}")
    public String getChildForSanta(@PathVariable String santa,@PathVariable String  code){
        return service.getChildForSanta(santa,code);
    }
}
