import java.util.*;

class largest{

    public static int largest_num(int arr[]){
        int smax=Integer.MIN_VALUE;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;

                max=arr[i];
            }
            else if(arr[i]>smax){
                smax=arr[i];
            }
            
        }
        return smax;
    }
    public static void main(String[] args) {
        int arr[]={4,82,10,93,41};
        System.out.println(largest_num(arr));
    }
}