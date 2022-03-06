import java.util.Scanner;
public class App90 {
    public static void main(String[] args) {
        String string;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        string = sc.nextLine();
        for(int i = 0; i < string.length(); i++)
        {
            c = string.charAt(i);
            System.out.println(c);
        }
        sc.close();
    }
}