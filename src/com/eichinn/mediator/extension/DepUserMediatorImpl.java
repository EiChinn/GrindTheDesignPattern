package com.eichinn.mediator.extension;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/4/18.
 */
public class DepUserMediatorImpl {
    private static DepUserMediatorImpl instance = new DepUserMediatorImpl();

    private DepUserMediatorImpl() {
        initTestData();
    }

    public static DepUserMediatorImpl getInstance() {
        return instance;
    }

    /**
     * 完成因撤销部门的操作所引起的与人员的交互，需要去除相关关系
     * @param depId
     * @return
     */
    public boolean deleteDep(String depId) {
        //寻找与这个部门相关的人员，放到临时集合里面
        ArrayList<DepUserModel> temps = new ArrayList<>();
        for (DepUserModel depUserModel : depUserModels) {
            if (depId.equals(depUserModel.getDepId())) {
                temps.add(depUserModel);
            }
        }

        //从全集中删去相应的关系
        depUserModels.removeAll(temps);
        return false;
    }

    /**
     * 完成因人员离职引起的与部门的交互
     * @param userId
     * @return
     */
    public boolean deleteUser(String userId) {
        //寻找与这个人员相关的部门，放到临时集合里面
        ArrayList<DepUserModel> temps = new ArrayList<>();
        for (DepUserModel depUserModel : depUserModels) {
            if (userId.equals(depUserModel.getUserId())) {
                temps.add(depUserModel);
            }
        }

        //从全集中删去相应的关系
        depUserModels.removeAll(temps);
        return false;
    }

    public boolean changeDep(String userId, String oldDepId, String newDepId) {
        return false;
    }

    /**
     * 部门合并
     * @param depIds
     * @param newDep
     * @return
     */
    public boolean joinDep(List<String> depIds, Dep newDep) {
        return false;
    }


    private ArrayList<DepUserModel> depUserModels = new ArrayList<>();

    private void initTestData() {
        DepUserModel du1 = new DepUserModel();
        du1.setDepUserId("du1");
        du1.setDepId("d1");
        du1.setUserId("u1");
        depUserModels.add(du1);

        DepUserModel du2 = new DepUserModel();
        du2.setDepUserId("du2");
        du2.setDepId("d1");
        du2.setUserId("u2");
        depUserModels.add(du2);

        DepUserModel du3 = new DepUserModel();
        du3.setDepUserId("du3");
        du3.setDepId("d2");
        du3.setUserId("u3");
        depUserModels.add(du3);

        DepUserModel du4 = new DepUserModel();
        du4.setDepUserId("du4");
        du4.setDepId("d2");
        du4.setUserId("u4");
        depUserModels.add(du4);

        DepUserModel du5 = new DepUserModel();
        du5.setDepUserId("du5");
        du5.setDepId("d2");
        du5.setUserId("u1");
        depUserModels.add(du5);


    }

    public void showDepUsers(Dep dep) {
        for (DepUserModel depUserModel : depUserModels) {
            if (depUserModel.getDepId().equals(dep.getDepId())) {
                System.out.println("DepId=" + dep.getDepId() + " has UserId=" + depUserModel.getUserId());
            }
        }
    }

    public void showUserDeps(User user) {
        for (DepUserModel depUserModel : depUserModels) {
            if (depUserModel.getUserId().equals(user.getUserId())) {
                System.out.println("UserId=" + user.getUserId() + " has DepId=" + depUserModel.getDepId());
            }
        }
    }


}
