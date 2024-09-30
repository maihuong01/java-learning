import java.util.Scanner;

public class bai17_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số nguyên n: ");
    int n = sc.nextInt();
    int tong = 1;
    for (int i = 1; i <= n; i++) {
      tong *= i;
    }
    System.out.println("Giai thừa của " + n + " là: " + tong);
    sc.close();
  }
}
