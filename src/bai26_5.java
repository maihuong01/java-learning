public class bai26_5 {
  public static void main(String[] args) {
    String st1 = "English = 78 Science = 83 Math = 68 History = 65";
    int sum = 0;
    int count = 0;
//    for (int i = 0; i < st1.length(); i++) {
//      char ch = st1.charAt(i);
//      if(Character.isDigit(ch)){
//        int num = Integer.parseInt(String.valueOf(ch));
//        sum += num;
//        count++;
//      }
//    }
//    System.out.println("Tổng các số trong chuỗi: " + sum);
//    System.out.println("Số lượng các số trong chuỗi: " + count);
    String[] arr = st1.split(" ");
    for (String s : arr) {
      if (Character.isDigit(s.charAt(0))) {
        sum += Integer.parseInt(s);
        count++;
      }
    }
    System.out.println("Tổng các số trong chuỗi: " + sum);
    System.out.println("Số lượng các số trong chuỗi: " + count);

  }
}
