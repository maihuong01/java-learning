import java.util.Scanner;

public class bai17_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số nguyên n: ");
    int n = sc.nextInt();
    int tong = 0;

    if (n % 2 == 0) {
      for (int i = 0; i <= n; i+=2) {
        tong += i;

      }
      System.out.println("Tổng của " + n + " là: " + tong);
    } else {
      System.out.println("Số " + n + " là số lẻ và chúng khong ");

    }

  }
}
