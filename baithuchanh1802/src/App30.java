import java.util.Scanner;
public class App30 {       
    public static void main(String[] args) {  
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong: ");
        so = sc.nextInt();           
        int sodu, tong = 0;     
        while (so > 0) {
            sodu = so % 10;
            so = so / 10;
            tong += sodu;
        }         
        System.out.println("Tong cac chu so = " + tong);
        sc.close();
    }
}
