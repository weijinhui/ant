package com.ant.service.impl;

import com.ant.dao.TargetAppDao;
import com.ant.pojo.TargetApp;
import com.ant.service.ITargetAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/26 0026 15:07
 * @Description:
 */
@Service
public class ITargetAppServiceImpl implements ITargetAppService {
    @Autowired
    private TargetAppDao targetAppDao;
    public int addTargetApp(TargetApp targetApp) {
        return targetAppDao.addTargetApp(targetApp);
    }

    public int updateTargetApp(TargetApp targetApp) {
        return targetAppDao.updateTargetApp(targetApp);
    }

    public List<TargetApp> getTargetAppList(TargetApp targetApp) {
        return targetAppDao.getTargetAppList(targetApp);
    }

    public TargetApp getTargetAppById(String id) {
        return targetAppDao.getTargetAppById(id);
    }


}
