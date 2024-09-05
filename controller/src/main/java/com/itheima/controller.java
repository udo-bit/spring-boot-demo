package com.itheima;

import com.itheima.Domain.User;
import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class controller {
    @Autowired
    private UserDao userDao;

    @GetMapping("/findAll")
    List<User> findAll(){
        return userDao.selectList(null);
    }



}
