package Customer;
import Person.Person;
import java.util.Scanner;

public class Customer extends Person{
    public int luong;
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }

    public void nhapLuong() {
        System.out.println("Nhap luong: ");
        luong = sc.nextInt();
    }

    public void inLuong() {
        System.out.println("Luong: " + luong);
    }
}
