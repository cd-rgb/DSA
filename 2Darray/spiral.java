public class spiral {

    public static void spiral1(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // print the top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // print the right
            for (int i = startRow + 1; i <= endRow; i++) {
                
                    System.out.print(arr[i][endCol] + " ");
                }
            
            // print the bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                } 
                    System.out.print(arr[endRow][j] + " ");
                
            }

            // print the left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (endCol == startCol) {
                    break;
                } 
                System.out.print(arr[i][startCol] + " ");
            
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        }

    

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3}, { 5, 6, 7}, { 9, 10, 11}, { 13, 14, 15} };
        spiral1(arr);
    }

}
