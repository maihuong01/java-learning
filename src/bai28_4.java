import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bai28_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập số phần tử của mảng: ");
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>(n);

    int max50 = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("Nhập phần tử thứ arr[" + i + "] : ");
      int e = (int) Math.pow(sc.nextInt(), 2);
      if (e > 50) {
        max50 += 1;
      }
      arr.add(e);
    }
    System.out.println("Mảng vừa nhập: ");
    System.out.println(arr);
    System.out.println("Số phần tử có giá trị lớn hơn 50: " + max50);
  }
}
