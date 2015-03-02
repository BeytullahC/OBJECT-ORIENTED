package model;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class Worker extends Human {

    private String sicilNo;

    @Override
    public void create(){
        System.out.println("Worker created");
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
}
