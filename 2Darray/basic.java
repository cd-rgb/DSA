
import java.util.*;

public class basic {

    public static void createANDdisplay(int key) {
        int arr[][] = new int[3][3];
        int max=Integer.MIN_VALUE;
        int n = arr.length;// give no of rows
        int m = arr[0].length;// give no of colums in each row
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //finding the element in 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] ==key){
                    System.out.println("element found at"+i+" "+j);
                } 
                
            }

        }
        //max element in 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                } 
                
            }
        }
        System.out.println("max element in 2D array is"+max);


    }

    public static void main(String[] args) {
        createANDdisplay(5);
    }

}
