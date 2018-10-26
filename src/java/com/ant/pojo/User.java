package com.ant.pojo;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    private String username;
    private  String password;
    private String telephone;
    private String welCode;
    private String realname;
   private int masterId;
   private int bankcardId;
   private Double balance;




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
