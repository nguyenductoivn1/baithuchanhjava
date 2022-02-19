import java.util.Scanner;
public class App35 {
    public static void main (String[] args) {
        double so1, so2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu 1: ");
        so1 = sc.nextDouble();
        System.out.print("Nhap so thu 2: ");
        so2 = sc.nextDouble();
        if(so1 < so2)
            System.out.print("So nho nhat trong 2 so la: " + so1);
        else
            System.out.print("So nho nhat trong 2 so la: " + so2);  
        sc.close();    
    }
}
