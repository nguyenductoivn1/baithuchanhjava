import java.util.ArrayList;
public class App16 {
    public static void main(String[] args) {
        ArrayList<String> arrListString = new ArrayList<>();

        arrListString.add("java");
        arrListString.add("php");
        arrListString.add("c#");
        arrListString.add("c++");

        System.out.println("Cac phan tu co trong arrListString la: ");
        for(int i = 0; i < arrListString.size(); i++) 
            System.out.print(arrListString.get(i) + "\t");

        System.out.print("\n");

        arrListString.set(2, "html");
        arrListString.remove(3);
        for(int i = 0; i < arrListString.size(); i++)
            System.out.print(arrListString.get(i) + "\t");
    }
}
