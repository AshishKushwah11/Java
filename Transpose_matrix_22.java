import java.util.Arrays;

/**
 * Reverse_all_rows_21
 */
public class Transpose_matrix_22  {

    public static void main(String[] args) {
        
        int arr [][] = {{00,01,02,03}
                      ,{10,11,12,13},
                      {20,21,22,23},
                    {30,31,32,33}};
        
        int row = arr.length;
        int columns = arr[0].length;
        int [][] temp = new int[row][columns];
        
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
           
            

                temp[c][r] = arr[r][c];

            

               

                 
                } 
                // System.out.println();
            }
            System.out.print(Arrays.deepToString(temp));
        }
    }
 