class Solution {
    public int maxProfit(int[] arr) {
      int max=0;

        int min = arr[0];

        for (int i =1;i<arr.length;i++)
        {
            min = Math.min(min,arr[i]);

            int profit =arr[i]-min;

            max = Math.max(max , profit ) ;
        }

        return max ;

    }
}