
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

              // --- Bài 2.5: Tính tổng từ 1 đến n ---
        System.out.print("Nập n: ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + tong);

        sc.close();
    }
}
