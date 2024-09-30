import java.util.Scanner;

public class bai17_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số nguyên n: ");
    int n = sc.nextInt();
    int tong = 0;
    int i = 1;
    while(i <= n){
      if(i == 3) {
        i+=2;
        continue;
      }
      tong += i;
      i+=2;
    }
    System.out.println("Tổng các số từ 0 đến " + n + " trừ 3 là: " + tong);
  }
}
