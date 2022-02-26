import java.util.Scanner;
public class app3 {
    public static boolean snt(int n) {
        if (n <= 1) 
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so: ");
        int n = sc.nextInt();
        sc.close();
        if(snt(n)) 
            System.out.println(n + " la so nguyen to");
        else
            System.out.println(n + " khong la so nguyen to");       
    }   
}