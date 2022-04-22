package Student;
import java.util.Scanner;
public class OfflineStudent extends Student {
    public String trangthai;

    public OfflineStudent() {
        LoaiSV = "Sinh vien hoc offline";
    }
    
    public void nhapTrangThai() {
        System.out.println("Nhap trang thai: ");
        Scanner sc = new Scanner(System.in);
        trangthai = sc.nextLine();
    }

    public void inTrangThai() {
        System.out.println("Trang thai: " + trangthai);
    }
}