import java.util.Scanner;
public class App74 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
        }while (n < 0);
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
        a[i] = sc.nextInt();
    }
    sc.close();
    int s = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 0) 
            s += a[i];
    }
        System.out.print("Tong cac so chan trong mang = " + s);
    }   
}