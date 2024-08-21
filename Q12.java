public class Q12 {

  public static void main(String[] args) {

    int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };

    int k = 2;

    boolean flag = false;

    for (int r = 0; r < arr.length; r++) {
      for (int c = 0; c < arr[0].length; c++) {
        if (k == arr[r][c]) {
          flag = true;
          break;
        }
      }
    }
    System.out.println(flag);

  }

}
