package com.ant.dao;

import com.ant.pojo.Father;
import com.ant.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/10/25 0025 08:35
 * @Description:
 */
public interface IFatherDao {
    public User getFatherById(@Param("id") String id);
    public List<User> getFatherUser();
    public int addFather(Father father);
    public int updateFather(Father father);
    public int delete(@Param("id") int id);

}
