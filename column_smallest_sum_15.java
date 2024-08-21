public class column_smallest_sum_15 {

    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, }, 
                       { 4, 5, 6 }, 
                       { 7, 8, 9 } };

        int mincol = 0;

        int sum = Integer.MAX_VALUE;

        for (int c = 0; c < arr.length; c++) {

            int tempsum = 0;

            for (int r = 0; r < arr[0].length; r++) {
                tempsum += arr[r][c];

            }

            if (tempsum < sum) {
                sum = tempsum;
                mincol = c;
            }
        }

        System.out.println(sum + " " + mincol);
    }

}
