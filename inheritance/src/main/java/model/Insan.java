package model;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class Insan {

    private String name;
    private String surname;
    private Integer yas;
    private String kimlikNo;
    private String insanId;

    public void ekle(){
        System.out.println("INSAN EKLENDI");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getInsanId() {
        return insanId;
    }

    public void setInsanId(String insanId) {
        this.insanId = insanId;
    }
}
