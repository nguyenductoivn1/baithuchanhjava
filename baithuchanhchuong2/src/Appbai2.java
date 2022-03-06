import java.util.Scanner;
public class Appbai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = sc.nextInt();
        sc.close();
        if(a % 2 == 0)
            System.out.print(a + " la so chan");
        else 
            System.out.print(a + " la so le");
    }
}
