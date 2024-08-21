public class max7 {

    public static void main(String [] args){

        int [] [] arr = {{1,2,3,4,  5},{6,7,8,9,10},{12,13,13,14,15}};

        int max = Integer.MIN_VALUE;

        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){

                if(max<arr[r][c]){

                    max = arr[r][c];
                }
            }
        }
        System.out.println(max);
    }
    
}
