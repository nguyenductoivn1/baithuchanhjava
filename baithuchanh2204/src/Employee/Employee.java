package Employee;
import java.util.Scanner;

import Person.Person;
public class Employee extends Person {
    public String LoaiNV;

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }
    
    public void xuatLoaiNV() {
        System.out.println("\n\n==== " + LoaiNV + " ====");
    }
}