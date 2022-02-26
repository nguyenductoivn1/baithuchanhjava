import java.util.Scanner;
public class app2 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhap canh a: ");
        a = sc.nextDouble();        
        System.out.print("Nhap canh b: ");
        b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        c = sc.nextDouble();
        sc.close();
        if(a<b+c && b<a+c && c<a+b) {
            if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) 
                System.out.print("Tam giac vuong");
            else if(a == b && b == c)
                System.out.print("Tam giac deu");
            else if(a == b || b == c || c == a)
                System.out.print("Tam giac can");
        }
        else {
            System.out.print("Khong phai la tam giac");
        }
    }
}
