package com.eichinn.mediator.extension;

/**
 * Created by ei_chinn on 2017/4/18.
 */
public class Dep {
    private String depId;
    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * 撤销部门
     * @return
     */
    public boolean deleteDep() {
        //先通过中介者去除掉所有与这个部门相关的部门和人员关系
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);

        //撤销部门的操作

        return true;


    }
}
