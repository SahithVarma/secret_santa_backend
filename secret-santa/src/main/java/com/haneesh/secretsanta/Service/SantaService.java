package com.haneesh.secretsanta.Service;

import com.haneesh.secretsanta.Model.Santa;
import com.haneesh.secretsanta.Model.User;
import com.haneesh.secretsanta.Repository.SantaRepo;
import com.haneesh.secretsanta.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SantaService {
    @Autowired
    UserRepo userrepo;
    @Autowired
    SantaRepo santarepo;
    public List<Santa> getAllSantasAndChilds(String code) {
        return santarepo.findByUniqueCode(code);
    }
    public String generateSecretSanta(String code) {
        List<User> Allusers=userrepo.findAllByUniqueCode(code);
        List<String> users = new ArrayList<>();
        System.out.println(Allusers);
        for(User u:Allusers){
            users.add(u.getName());
        }
        Map<String, String> d = new HashMap<>();
        List<String> unused = new ArrayList<>(users);


        List<String> names = new ArrayList<>(unused);
        for (String name : names) {
            List<String> leftOver = new ArrayList<>(unused);
            if (leftOver.contains(name)) {
                leftOver.remove(name);
            }
            String randomGuy = leftOver.get(new Random().nextInt(leftOver.size()));
            d.put(name, randomGuy);
            unused.remove(randomGuy);
        }
        d.forEach((key, value) -> {
            Santa santa=new Santa(key,value,code);
            santarepo.save(santa);
        });
        return "Success!";
    }

    public String getChildForSanta(String santa, String code) {
        return santarepo.findBySantaAndUniqueCode(santa,code).getChild();
    }
}
