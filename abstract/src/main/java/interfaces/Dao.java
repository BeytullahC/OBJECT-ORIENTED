package interfaces;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public interface Dao {

    public Customer findCustomer();

    public  Customer findById(Integer id);

    public  void deleteCustomer(Integer id) throws Exception;

    public List<Customer> selectAllCustomer();

}
