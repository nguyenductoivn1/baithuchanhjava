import java.util.Scanner;
public class app1 { 
    public static int ucln(int so1, int so2) {
        if(so1 == 0 || so2 == 0)
            return so1 + so2;
        while(so1 * so2 != 0) {
            if(so1 > so2)
                so1 %= so2;
            else 
                so2 %= so1;
        }
        return so1 + so2;
    }
    public static void main(String[] args) {
        int so1, so2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        so1 = sc.nextInt();
        System.out.print("Nhap b: ");
        so2 = sc.nextInt();
        sc.close();
        System.out.print("UCLN cua " + so1 + " va " + so2 + " la: " + ucln(so1, so2));
    }
}
