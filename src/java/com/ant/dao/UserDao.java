package com.ant.dao;

import com.ant.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/10/25 0025 08:35
 * @Description:
 */
@Repository
public interface UserDao {
     User getUserById(@Param("id") String id);
     List<User> getAllUser();
     int addUser(User user);
     int updateUser(User user);
     int delete(@Param("id") int id);

}
