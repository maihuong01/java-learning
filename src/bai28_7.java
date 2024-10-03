import java.util.ArrayList;
import java.util.List;

public class bai28_7 {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(List.of(1,9,3,14,5,27,8));
    int lonnhat = 0;
    int lonthu2 = 0;
    for (Integer integer : arr) {
      if (integer > lonnhat) {
        lonthu2 = lonnhat;
        lonnhat = integer;
      } else if (integer > lonthu2) {
        lonthu2 = integer;
      }
    }
    System.out.println("Phần tử lớn nhất: " + lonnhat);
    System.out.println("Phần tử lớn thứ 2: " + lonthu2);
  }
}
