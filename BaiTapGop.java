
import java.util.Scanner;

public class BaiTapGop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Bài 2.4: Tính diện tích hình tròn ---
        System.out.print("Nhập bán kính r: ");
        double r = sc.nextDouble();
        double dienTich = Math.PI * r * r;
        System.out.println("Diện tích hình tròn là: " + dienTich);

        System.out.println("------------------------------");

      
        sc.close();
    }
}
