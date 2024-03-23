package com.haneesh.secretsanta.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
}
