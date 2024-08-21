public class _largest_sum14 {

    public static void main(String[] args){

        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int maxRow = 0;

        int sum = Integer.MIN_VALUE;

        for(int r=0;r<arr.length;r++){
         int   tempsum = 0;

            for(int c=0;c<arr[0].length;c++){

                tempsum+=arr[r][c];
            }

            if(tempsum>sum){
                sum = tempsum ;
                maxRow = r;
            }
        }
System.out.println(sum+" "+maxRow);
    }
    
}
