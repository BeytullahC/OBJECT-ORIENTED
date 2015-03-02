package runner;

import model.*;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class Tester {

    public static void main(String[] args) {
        Human human = new Human();
        human.create();
        Manager manager = new Manager();
        System.out.println("MANAGER CREATE METHOD is not found");
        manager.create();
        manager.setAge(50);
        System.out.println(manager.getAge());
        driver driver = new driver();
        driver.setSurname("test");
        Worker worker = new Worker();
        worker.create();
        Human parent = new Worker();
        parent.setName("BEYTULLAH");
        parent.create();
        Human parentCostumer = new Costumer();
        parentCostumer.create();
        System.out.println(parentCostumer.getClass());
        System.out.println(parent.getClass());
        Human humanT = new driver();
        humanT.create();
    }
}
