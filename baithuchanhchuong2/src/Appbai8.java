import java.util.Scanner;
public class Appbai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int a, s = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap so: ");
            a = sc.nextInt();
            s += a;
        }
        sc.close();
        System.out.print("Trung binh cong cua " + n + " so nguyen vua nhap = " + (s/n));
    }
}
