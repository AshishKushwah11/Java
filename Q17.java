public class Q17 {
public static void main(String[]args){

int [] [] arr ={{1,2,3,4,5,},
                {6,7,8,9,10,},
                {11,12,13,14,15}};

for(int c=0;c<arr[0].length;c++){

    if(c%2==0){
        for(int r=0;r<arr.length;r++){
            System.out.print(arr[r][c]+"\t");
        }
    }else{
        for(int r=arr.length-1;r>=0;r--){
            System.out.print(arr[r][c]+"\t");
  
        }
    }
                System.out.println();

    }
}
}
    
