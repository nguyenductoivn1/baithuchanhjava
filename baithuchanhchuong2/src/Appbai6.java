import java.util.Scanner;
public class Appbai6 {
    public static int giaithua(int n) {
        if(n == 1)
            return 1;
        return n * giaithua(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so: ");
            n = sc.nextInt();
        }while(n <= 0);
        sc.close();
        System.out.print("Giai thua cua " + n + " = " + giaithua(n));
    } 
}
