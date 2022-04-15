package Shapes;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;

    public hinhchunhat() {
        ten = "Hinh chu nhat";
    }

    public void nhapchieudai() {
        System.out.println("Chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }

    public void nhapchieurong() {
        System.out.println("Chieu rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }

    public void tinhchuvi() {
        chuvi = 2 * (dai + rong);
    }

    public void tinhdientich() {
        dientich = dai * rong;
    }
}
