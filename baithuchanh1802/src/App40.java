import java.util.Scanner;
public class App40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngay;
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        sc.close();
        switch(ngay) {
            case 1: 
                System.out.print("Thu 2");
                break;
            case 2: 
                System.out.print("Thu 3");
                break;
            case 3: 
                System.out.print("Thu 4");
                break;
            case 4: 
                System.out.print("Thu 5");
                break;
            case 5: 
                System.out.print("Thu 6");
                break;
            case 6: 
                System.out.print("Thu 7");
                break;
            case 7: 
                System.out.print("Chu nhat");
                break;
            default:
                System.out.print("Ngay khong hop le");
        }        
    }
}
