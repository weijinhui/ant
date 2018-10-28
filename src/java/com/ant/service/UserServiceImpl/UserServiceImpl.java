package com.ant.service.UserServiceImpl;

import com.ant.dao.IUserDao;
import com.ant.pojo.User;
import com.ant.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao userDao;
    public boolean login (String username,String password){
        if("weijinhui".equals(username)&&"123456".equals(password)){
            return true;
        }else {
            return false;
        }

    }

    public int addUser(User user){
        int i = userDao.addUser(user);
        return i;
    }
}
