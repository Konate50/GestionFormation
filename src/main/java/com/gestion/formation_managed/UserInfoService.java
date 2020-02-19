package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.UserInfoRespository;
import com.gestion.formation_managed.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoService {
    @Autowired
    private UserInfoRespository userInfoRespository;

    //Pour ajouter des utilisateur
    @PostMapping(value = "/listUsers")
    public User save(@RequestBody User u){
        return userInfoRespository.save(u);
    }
}
