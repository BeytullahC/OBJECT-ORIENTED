package runner;

import dao.DbIslemleri;
import dao.impl.DbIslemleriImplOracle;
import dao.impl.DbIslemleriImplSqlSrv;
import model.User;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class Tester {
    public static void main(String[] args) {
        /*DbIslemleriImplOracle oracle = new DbIslemleriImplOracle();
        oracle.callOracleFunction();
        DbIslemleriImplSqlSrv implSqlSrv = new DbIslemleriImplSqlSrv();
        implSqlSrv.callStoreProcedure();*/
        try {
            DbIslemleri dbIslemleri = new DbIslemleriImplSqlSrv();
            dbIslemleri.insertUser(new User());
            dbIslemleri = new DbIslemleriImplOracle();
            dbIslemleri.insertUser(new User());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
