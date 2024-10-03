import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số phần tử của mảng: ");
     int n =sc.nextInt();
    Random rand = new Random();
    ArrayList<Integer> arr = new ArrayList<Integer>(n);
    for (int i = 0; i < n; i++) {
      arr.add(rand.nextInt(100));
    }
    System.out.println("Mảng vừa tạo: ");
    System.out.println(arr);
    sc.close();
  }
}
