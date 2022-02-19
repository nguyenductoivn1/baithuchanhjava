import java.util.Scanner;
public class App47 {   
    public static void main (String []args) {
        int so, tong = 0;
        Scanner sc = new Scanner(System.in);    
        while(tong < 100) {
            System.out.print("Nhap so nguyen: ");
            so = sc.nextInt();
            tong += so;
        }
        System.out.print("Tong cac so da nhap = " + tong);
        sc.close();
    }
}
