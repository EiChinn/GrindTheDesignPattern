package com.eichinn.mediator.extension;

/**
 * Created by ei_chinn on 2017/4/18.
 */
public class User {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean dimission() {
        //先通过中介者去除掉所有与这个人员相关的部门和人员的关系
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteUser(userId);

        //清除人员档案

        return true;
    }
}
