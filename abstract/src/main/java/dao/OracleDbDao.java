package dao;

import abstracts.dbAbstract;
import interfaces.Dao;
import model.Customer;

import java.sql.Connection;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class OracleDbDao extends dbAbstract implements Dao {

    @Override
    protected Connection getConnection() {
        System.out.println("getConnection");
        return null;
    }

    @Override
    public Customer findById(Integer id) {
        System.out.println("findById");
        return null;
    }

    @Override
    public void deleteCustomer(Integer id) throws Exception {
        System.out.println("deleteCustomer");
    }
}
