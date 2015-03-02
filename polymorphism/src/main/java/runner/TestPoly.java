package runner;

import model.Costumer;
import model.Human;
import model.Worker;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class TestPoly {
    public static void main(String[] args) {
        Human hCustomer = new Costumer();
        hCustomer.create();
        Human hWorker = new Worker();
        hWorker.create();
    }
}
