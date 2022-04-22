package Customer;
import Person.Person;
import java.util.Scanner;
public class VIPCustomer extends Person {
    public String LoaiKH;
    Scanner sc = new Scanner(System.in);

    public VIPCustomer() {
        LoaiKH = "Khach hang VIP";
    }

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }

    public void xuatLoaiKH() {
        System.out.println("\n\n==== " + LoaiKH + " ====");
    }
}