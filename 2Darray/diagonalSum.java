

public class diagonalSum {

    public static void diaSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
                if(i+j==arr[0].length-1 && i!=j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        diaSum(arr);
    }
    
}
