package com.ant.dao;

import com.ant.pojo.TargetApp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/26 0026 14:53
 * @Description:
 */
@Repository
public interface TargetAppDao {
    int addTargetApp(TargetApp targetApp);
    int updateTargetApp(TargetApp targetApp);
    List<TargetApp> getTargetAppList(TargetApp targetApp);
    TargetApp getTargetAppById(@Param("id") String id);
}
