import java.util.Scanner;
public class Appbai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Nhap so t1: ");
        a = sc.nextDouble();
        System.out.print("Nhap so t2: ");
        b = sc.nextDouble();
        sc.close();
        System.out.println("Tong 2 so = " + (a + b));
        System.out.println("Hieu 2 so = " + (a - b));
        System.out.println("Tich 2 so = " + (a * b));
        System.out.println("Thuong 2 so = " + (a / b));
        System.out.println("Chia lay du 2 so = " + (a % b));
        if(a < b) 
            System.out.print(a + " be hon " + b);
        else if(a > b)
            System.out.print(a + " lon hon " + b);
        else 
        System.out.print(a + " bang " + b);
    }
}
