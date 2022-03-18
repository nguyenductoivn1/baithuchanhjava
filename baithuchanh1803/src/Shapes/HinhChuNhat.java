package Shapes;
import java.util.Scanner;
public class HinhChuNhat {
    float cd, cr;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        cd = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        cr = sc.nextFloat();
    }
    public float chuvi() {
        return (cd + cr) * 2;
    }
    public float dientich() {
        return cd * cr;
    }
    public void inchuvivadientich() {
        System.out.println("Chu vi = " + chuvi());
        System.out.print("Dien tich = " + dientich());
    }
}

