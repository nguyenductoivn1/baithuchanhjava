import java.util.Scanner;
public class app4 {
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
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 2; i < n; i++) {
            if(snt(i))
                System.out.print(i + " ");
        }
    }
}