package Employee;
import java.util.Scanner;
public class ParttimeEmployee extends Employee {

    public int luong;

    public ParttimeEmployee() {
        LoaiNV = "Nhan vien thoi vu";
    }

    public void nhapLuong() {
        System.out.println("Nhap luong: ");
        Scanner sc = new Scanner(System.in);
        luong = sc.nextInt();
    }

    public void inLuong() {
        System.out.println("Luong: " + luong);
    }
}
