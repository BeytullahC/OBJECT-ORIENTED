package runner;

import abstracts.dbAbstract;
import dao.OracleDbDao;
import interfaces.Dao;
import model.Customer;

import java.sql.Connection;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class TestRunner {

    public static void main(String[] args) {
        OracleDbDao oracleDbDao = new OracleDbDao();
        oracleDbDao.findById(1);
        Dao dao  =new OracleDbDao();
        dao.findById(1);
    }

}
