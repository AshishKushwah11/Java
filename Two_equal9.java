public class Two_equal9 {
    public static void main(String[] args) {
        
        int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

       int [][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};


        boolean ans = true ;

        if(arr.length == arr2.length && arr[0].length==arr2[0].length ){

            for(int r=0;r<arr.length;r++){
                for(int c=0;c<arr[0].length;c++){
                
                    if(arr[r][c] !=arr2[r][c]){
                        ans = false;
                    }
                    
                }
            }
        }else{
            ans = false;
        }
        System.out.println(ans);
    }
    
}
