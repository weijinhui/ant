package com.ant.dao;

import com.ant.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: Administrator
 * @Date: 2018/10/25 0025 08:35
 * @Description:
 */
public interface UserDao {
    User getUserById(@Param("id") String id);
}
