package dao;

import model.User;

import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public interface DbIslemleri {

    public Boolean insertUser(User user) throws Exception;

    public User updateUser(User user) throws Exception;

    public Integer deleteUser(Integer id) throws Exception;

    public List<User> selectAllUsers();

    public User selectUserById(Integer id);

}
