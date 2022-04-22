package Student;
import java.util.Scanner;

import Person.Person;
public class Student extends Person {

    public String LoaiSV;

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }

    public void xuatLoaiSV() {
        System.out.println("\n\n==== " + LoaiSV + " ====");
    }
}