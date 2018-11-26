package com.ant.pojo;

import java.sql.Timestamp;

/**
 * @Auther: Administrator
 * @Date: 2018/11/26 0026 14:47
 * @Description:
 */
public class TargetApp {
    private int id;
    private String appName;
    private String appRegisterUrl;
    private String appInfo;
    private String keyword;
    private Timestamp createTime;
    private Timestamp updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppRegisterUrl() {
        return appRegisterUrl;
    }

    public void setAppRegisterUrl(String appRegisterUrl) {
        this.appRegisterUrl = appRegisterUrl;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
