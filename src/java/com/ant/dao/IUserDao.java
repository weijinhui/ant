package com.ant.dao;

import com.ant.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/10/25 0025 08:35
 * @Description:
 */
public interface IUserDao {
    public User getUserById(@Param("id") String id);
    public List<User> getAllUser();
    public int addUser(User user);
    public int updateUser(User user);
    public int delete(@Param("id") int id);

}
