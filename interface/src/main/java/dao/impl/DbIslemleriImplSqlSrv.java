package dao.impl;

import dao.DbIslemleri;
import model.User;

import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class DbIslemleriImplSqlSrv implements DbIslemleri {
    @Override
    public Boolean insertUser(User user) throws Exception {
        System.out.println("DbIslemleriImplSqlSrv.insertUser process success");
        return true;
    }

    @Override
    public User updateUser(User user) throws Exception {
        return null;
    }

    @Override
    public Integer deleteUser(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public User selectUserById(Integer id) {
        return null;
    }

    public void callStoreProcedure(){
        System.out.println("DbIslemleriImplSqlSrv.callStoreProcedure method called...");
    }

}
