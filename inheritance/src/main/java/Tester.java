import model.Insan;
import model.Tesfiye;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class Tester {

    public static void main(String[] args) {
        /*Insan insan = new Insan();
        insan.ekle();
        Yonetici yonetici = new Yonetici();
        System.out.println("YONETICIDE EKLE METHODU YOK");
        yonetici.ekle();
        yonetici.setYas(50);
        System.out.println(yonetici.getYas());
        Tesfiye tesfiye = new Tesfiye();
        tesfiye.setSurname("test");
        Isci isci = new Isci();
        isci.ekle();*/
        /*Insan baba = new Isci();
        baba.setName("BEYTULLAH");
        baba.ekle();
        Insan musteriBabasi= new Musteri();
        musteriBabasi.ekle();
        if(musteriBabasi instanceof Musteri){
            System.out.println("MUSTERI BABASI MUSTERIDEN OLUSTURLDU");
        }

        if(baba instanceof Musteri){
            System.out.println("baba musteriden olusturuldu");
        }else
            System.out.println("BABANIN OLUSTUGU CLASS FARKLI "+baba.getClass());*/

        Insan insanT = new Tesfiye();
        insanT.ekle();
    }
}
