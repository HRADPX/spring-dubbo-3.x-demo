package com.hr.user;

import java.io.Serializable;

/**
 * @author huangran <huangran@kuaishou.com>
 * Created on 2023-12-03
 */
public class User implements Serializable {
    private String uid;
    private String name;

    public User() {
    }

    public User(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
