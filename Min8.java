public class Min8 {

    public static void main(String[] args) {
        
        int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

      int min = Integer.MAX_VALUE;
      
      for(int r=0;r<arr.length;r++){
        for(int c=0;c<arr[0].length;c++){
            if(min>arr[r][c]){
                min=arr[r][c];
            }
        }
      }
      System.out.println(min);
    }
}
