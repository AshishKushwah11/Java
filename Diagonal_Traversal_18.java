public class Diagonal_Traversal_18 {

    public static void main(String[] args) {

        int[][] arr = { { 00, 01, 02, 03, 04 },
                        { 10, 11, 12, 13, 14 },
                        { 20, 21, 22, 23, 24 },
                        { 30, 31, 32, 33, 34 },
                        { 40, 41, 42, 43, 44 }

        };

        for (int k = 0; k < arr.length; k++) {
            for (int r = 0; r < arr.length; r++) {
                for (int c = 0; c < arr[0].length; c++) {
                    if (r + k == c) {
                        System.out.print(arr[r][c] + " ");
                    }
                }
            }
        }
    }
}