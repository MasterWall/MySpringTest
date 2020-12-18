package com.example.jdbctemplate;

/**
 * @author cyx
 * @date 2020/12/18
 */
public class Book {

    // 数据库test模板下的userinfo表中创建三个column，userId，username，ustatus
    private String userId;
    private String username;
    private String ustatus;

    // get和set方法
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
