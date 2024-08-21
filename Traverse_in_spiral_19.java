public class Traverse_in_spiral_19 {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int m = arr.length;
        int n = arr[0].length;


        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
       
        int dir = 0; // 0 -> right, 1 -> down, 2 -> left, 3 -> up
        dir = (dir + 1) % 4;
       
        while (top <= bottom && left <= right) {
           
            if (dir == 0) {
                // move right
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + "\t");
                }
                top++;
            }
           
            else if (dir == 1) {
                // move down
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + "\t");
                }
                right--;
            } else if (dir == 2) {
                // move left
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + "\t");
                }
                bottom--;
            } else if (dir == 3) {
                // move up
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + "\t");
                }
                left++;
            }
            System.out.println();
        }
    }
}