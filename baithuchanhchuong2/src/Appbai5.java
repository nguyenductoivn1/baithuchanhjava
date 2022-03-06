import java.util.Scanner;
public class Appbai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        double s = 0;
        while(s <= 100) {
            System.out.print("Nhap so: ");
            n = sc.nextDouble();
            s += n;
        }
        sc.close();
        System.out.print("Tong cac so da nhap = " + s);
    }
}
