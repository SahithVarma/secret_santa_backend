package com.haneesh.secretsanta.Controller;


import com.haneesh.secretsanta.Model.Task;
import com.haneesh.secretsanta.Model.User;
import com.haneesh.secretsanta.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService service;
    @PostMapping("/createUser")
    public String CreateUserByName(@RequestBody User user){
        return service.createUserByName(user);
    }

    @PostMapping("/updateUser/{code}/{name}")
    public String UpdateUserDetails(@PathVariable String code,@PathVariable String name,@RequestBody User user){
        return service.updateUserDetails(code,name,user);
    }

    @GetMapping("/getusers/{code}")
    public List<User> getAllUsersByUniqueCode(@PathVariable String code){
        return service.getAllUsersByUniqueCode(code);
    }

    @GetMapping("/pending/{code}")
    public int getPendingUsers(@PathVariable String code){
        return service.getPendingUsersCount(code);
    }

    @GetMapping("/getuserinfo/{username}/{code}")
    public User getUserInfoByUsernameAndUniqueCode(@PathVariable String username,@PathVariable String code){
        return service.getUserInfoByUsernameAndUniqueCode(username,code);
    }
    @PutMapping("/updatetask/{username}/{code}")
    public String updateTask(@PathVariable String username,@PathVariable String code,@RequestBody User user){
        return service.updateTask(username,code,user);
    }
    @PutMapping("/updatehint/{username}/{code}")
    public String updateHint(@PathVariable String username,@PathVariable String code,@RequestBody User user){
        return service.updateHint(username,code,user);
    }
    @GetMapping("/getChildWishlist/{username}/{code}")
    public String getChildWishlist(@PathVariable String username,@PathVariable String code){
        return service.getChildWishlist(username,code);
    }

    @GetMapping("/fetchTasks/{code}/{count}")
    public List<Task> fetchTasks(@PathVariable String code, @PathVariable int count){
        return service.fetchTasks(code,count);
    }

}
