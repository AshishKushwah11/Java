public class sum_arr6 {

    public static void main(String[] args) {
        
        int [] [] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        int sum = 0;

        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
               
                sum = sum + arr[r][c];
            
            }
        }
        System.out.print(sum);
    }
}
