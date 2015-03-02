package dao.impl;

import dao.DbIslemleri;
import model.User;

import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class DbIslemleriImplOracle implements DbIslemleri {

    @Override
    public Boolean insertUser(User user) throws Exception {
        System.out.println("DbIslemleriImplOracle.insertUser process success");
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
        return callOracleFunction();
    }

    @Override
    public User selectUserById(Integer id) {
        return null;
    }

    public List<User> callOracleFunction(){
        System.out.println("DbIslemleriImplOracle.callOracleFunction process success");
        return null;
    }
}
