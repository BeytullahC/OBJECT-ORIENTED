package model;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class Worker extends Human {

    private String registerNo;

    @Override
    public void create(){
        System.out.println("Worker created");
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }
}
