class Solution {
    public int maxProfit(int[] arr) {
      int max=0;

      
      int j = arr.length-1;

     int min= arr[0];

     for(int i=1;i<j+1;i++)
     {
        min = Math.min(min,arr[i]);

        int profit = arr[i]-min;
        max= Math.max(max,profit);
     }

      return max;


    }
}