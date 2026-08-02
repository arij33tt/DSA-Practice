class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j = arr.length-1;
        int max = 0;
        int min = arr[0];
        while(i<j)
        {
           min = Math.min(arr[i],arr[j]);

            int area = min * (j-i);
           if (arr[i]<arr[j])
           {
            max = Math.max (area,max);
            i++;
           } 


           else {
            max = Math.max(max , area);
            j--;
           }
        }

        return max ;
    }
}