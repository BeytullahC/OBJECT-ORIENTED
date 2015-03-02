package abstracts;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public abstract class dbAbstract {
    public Customer findCustomer() {
        System.out.println("findCustomer method called...");
        return new Customer();
    }

    protected abstract Connection getConnection();

    public abstract Customer findById(Integer id);

    public abstract void deleteCustomer(Integer id) throws Exception;

    public List<Customer> selectAllCustomer() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement("SELECT * from customer");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(resultSet);
            close(preparedStatement);
            close(connection);
        }
        return null;
    }

    private void close(AutoCloseable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }


}
