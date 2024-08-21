
public class Rotate_90_degree_23 {

    public static void main(String[] args) {

        int arr[][] = { { 00, 01, 02, 03 }, { 10, 11, 12, 13 },
                { 20, 21, 22, 23 },
                { 30, 31, 32, 33 } };

        for (int r = 0; r < arr.length; r++) {
            for (int c = arr[0].length - 1; c >= 0; c--) {

                System.out.print(arr[c][r] + "\t");

            }
            System.out.println();
        }
    }
}