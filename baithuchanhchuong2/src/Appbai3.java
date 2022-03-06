import java.util.Scanner;
public class Appbai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int year;
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
        sc.close();
        int tuoi = 2022 - year;
        if(tuoi < 16)
            System.out.print("Ban " + name + " o do tuoi vi thanh nien");
        else if(tuoi >= 16 && tuoi < 18)
            System.out.print("Ban " + name + " o do tuoi truong thanh");
        else 
            System.out.print("Ban " + name + " da gia");
    }
}
