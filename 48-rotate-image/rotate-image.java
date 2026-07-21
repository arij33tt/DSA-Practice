class Solution {
    public void rotate(int[][] arr) {
          int n= arr.length;
        int m=arr[0].length;
        for(int i=0;i<arr.length;i++)
        {
             for(int j=i+1;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }


        for(int i=0;i<arr.length;i++)
        {
            reverse(arr[i]);
        }
    }


    public int [] reverse(int [] arr)
    {
        int i=0;int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;j--;
        }
        return arr;
    }
}