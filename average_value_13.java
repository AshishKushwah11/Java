public class average_value_13 {
    
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int sum = 0;
        int av = 0;

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {

                sum += arr[r][c];
            }
        }
        int numofele = arr.length * arr[0].length;

        av = sum / numofele;

        System.out.println(av + " " + sum);
    }
}