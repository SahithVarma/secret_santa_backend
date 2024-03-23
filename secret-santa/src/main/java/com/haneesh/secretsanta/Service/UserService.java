package com.haneesh.secretsanta.Service;

import com.haneesh.secretsanta.Model.Task;
import com.haneesh.secretsanta.Model.User;
import com.haneesh.secretsanta.Repository.TaskRepo;
import com.haneesh.secretsanta.Repository.TeamRepo;
import com.haneesh.secretsanta.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userrepo;
    @Autowired
    TeamRepo teamrepo;
    @Autowired
    TaskRepo taskrepo;
    public String createUserByName(User user) {
        Boolean t=teamrepo.existsByUniqueCode(user.getUniqueCode());

        if(t) {
            if(!userrepo.existsByNameAndUniqueCode(user.getName(),user.getUniqueCode()))
            userrepo.save(user);
            return "success";
        }
        else{
            return "failure";
        }

    }

    public String updateUserDetails(String code, String name, User user) {
        User curr_user=userrepo.findByNameAndUniqueCode(name,code);
        curr_user.setAddress(user.getAddress());
        curr_user.setGmail(user.getGmail());
        curr_user.setWishlist(user.getWishlist());
        curr_user.setGift_status(user.isGift_status());
        curr_user.setPhoneNumber(user.getPhoneNumber());
        userrepo.save(curr_user);
        return "updated!";
    }

    public List<User> getAllUsersByUniqueCode(String code) {
        return  userrepo.findAllByUniqueCode(code);
    }

    public int getPendingUsersCount(String code) {
        int TotalUsers=teamrepo.findByUniqueCode(code).getNumOfPlayers();
        int RegisteredUsers=userrepo.getUsersCountByUniqueCode(code);
        return TotalUsers-RegisteredUsers;
    }

    public User getUserInfoByUsernameAndUniqueCode(String username, String code) {
        return userrepo.findByNameAndUniqueCode(username,code);
    }

    public String updateTask(String username, String code,User userReq) {
        try {
            User user = userrepo.findByNameAndUniqueCode(username, code);
            Task task=new Task(code,username,userReq.getTasks());
            user.setTasks(user.getTasks()==null?userReq.getTasks()+'\n':user.getTasks()+userReq.getTasks()+"\n");
            userrepo.save(user);
            taskrepo.save(task);
            return "success";
        }
        catch(Exception e){
            return "failed";
        }
    }

    public String updateHint(String username, String code,User userReq) {
        try {
            User user = userrepo.findByNameAndUniqueCode(username, code);
            user.setHints(user.getHints()==null?userReq.getHints()+'\n':user.getHints()+userReq.getHints()+"\n");
            userrepo.save(user);
            return "success";
        }
        catch(Exception e){
            return "failed";
        }
    }

    public String getChildWishlist(String username, String code) {
        User user=userrepo.findByNameAndUniqueCode(username,code);
        return user.getWishlist();
    }

    public List<Task> fetchTasks(String code, int count) {
        List<Task> tasks=taskrepo.fetchByUniqueCodeOrderByCreated(code,count);
        return tasks;
    }
}
