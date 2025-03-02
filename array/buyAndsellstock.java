public class buyAndsellstock {

    public static int maxProfit(int arr[]) {
        int maxProfit = 0;
        int buyPrice = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
                
                if(maxProfit==profit){
                    System.out.println("stock sell on date which gave profit is:"+i);
                }

            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));

    }
}
