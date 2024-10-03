import java.util.Scanner;

public class bai26_6 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập văn bản: ");
    String stInput = sc.nextLine();
    String stOutput = convertText(stInput);
    System.out.println("Text biến đổi: " + stOutput);

  }

  public static String convertText(String st1) {
    String a = "abcdefghijklmnopqrstuvwxyz";
    String b = "zxcvbnmasdfghjklqwertyuiop";
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < st1.length(); i++) {
      char ch = st1.charAt(i);
      int indexTextA = a.indexOf(ch);
      if (indexTextA != -1) {
        result.append(b.charAt(indexTextA));

      } else {
        result.append(ch);
      }
    }
    return result.toString();
  }
}
