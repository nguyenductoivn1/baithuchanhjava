import Employee.FulltimeEmployee;
import Employee.ParttimeEmployee;

public class App2 {
    public static void main(String[] args) {
        ParttimeEmployee pt = new ParttimeEmployee();
        FulltimeEmployee ft = new FulltimeEmployee();

        pt.nhap();
        pt.nhapLuong();
        ft.nhap();
        ft.nhapLuong();

        pt.xuatLoaiNV();
        pt.inHoten();
        pt.inTuoi();
        pt.inLuong();

        ft.xuatLoaiNV();
        ft.inHoten();
        ft.inTuoi();
        ft.inLuong();
    }
}
