public class bai17_7 {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
//        if (i == 1 || j == 1 || n - j >= i - 1) {
//          System.out.print("*" + "\t");
//        } else
//          System.out.print(" " + "\t");

        if(i+ j >= n + 1){
          System.out.print("*" + "\t");
        }else {
          System.out.print(" " + "\t");
        }
      }
      System.out.println();
    }
  }
}
