package com.ant.service.UserServiceImpl;

import com.ant.dao.IFatherDao;
import com.ant.pojo.Father;
import com.ant.service.IFatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatherServiceImpl implements IFatherService {
    @Autowired
    IFatherDao fatherDao;

    public int addFather(Father father){
        int i = fatherDao.addFather(father);
        return i;
    }
}
