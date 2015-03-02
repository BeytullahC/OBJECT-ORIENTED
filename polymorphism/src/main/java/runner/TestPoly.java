package runner;

import model.Customer;
import model.Human;
import model.Worker;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class TestPoly {
    public static void main(String[] args) {
        Human hCustomer = new Customer();
        hCustomer.create();
        Human hWorker = new Worker();
        hWorker.create();
    }
}
