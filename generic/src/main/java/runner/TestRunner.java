package runner;

import dao.generic.GenericInterFace;
import dao.impl.CustomerDao;
import dao.impl.ManagerDao;
import model.Customer;
import model.Manager;

import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class TestRunner {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        ManagerDao managerDao = new ManagerDao();
        GenericInterFace<Manager> inManager =new ManagerDao();
        try {
            customerDao.insert(new Customer());
            List<Customer> all = customerDao.findAll();
            inManager.insert(new Manager());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
