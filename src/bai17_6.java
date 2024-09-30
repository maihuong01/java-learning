import java.util.Scanner;

public class bai17_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số nguyên n: ");

    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {

      int tong = 0;
      for (int j = 1; j < i; j++) {
        if(i% j == 0) {
          tong += j;
        }
      }
      if(tong == i) {
        System.out.println(i + " là số hoàn hảo");
      }
    }
  }
}
