package Main;
import Slide_71.hinhtron;
public class App71 {
    public static void main(String[] args) {
        hinhtron hinhtron = new hinhtron();

        hinhtron.setBanKinh(10);

        float chuvi = hinhtron.tinhchuvi();
        float dientich = hinhtron.tinhdientich();
        System.out.println("Chu vi hinh tron: " + chuvi + "; va dien tich: " + dientich);
    }
}
