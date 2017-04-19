package com.eichinn.mediator.extension;

/**
 * Created by ei_chinn on 2017/4/19.
 */
public class Client {
    public static void main(String[] args) {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();

        Dep dep = new Dep();
        dep.setDepId("d1");
        Dep dep1 = new Dep();
        dep1.setDepId("d2");
        User user = new User();
        user.setUserId("u1");

        System.out.println("before delete dep");
        mediator.showUserDeps(user);
        dep.deleteDep();
        System.out.println("after delete dep");
        mediator.showUserDeps(user);

        System.out.println();

        System.out.println("before user left");
        mediator.showDepUsers(dep1);
        user.dimission();
        System.out.println("after user left");
        mediator.showDepUsers(dep1);


    }

}
