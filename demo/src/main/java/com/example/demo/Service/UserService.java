package com.example.demo.Service;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public  User selectUserByName(String name){
        return userDao.findUserByName(name);
    }

    public List<User> selectAllUser(){
        return userDao.findAllUser();
    }
    public void insertService(){
        userDao.insertUser("test",22,333.0);
        userDao.insertUser("test3",34,334.08);
    }

    public void deleteService(int id){
        userDao.deleteUser(id);
    }

    @Transactional
    public void changemoney(){
        userDao.updateUser("test888",22,888.09,3);
        int temp=1/0;
        userDao.updateUser("disy",18,4444.0,4);
    }
}
