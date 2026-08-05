class Solution {
    public int[] searchRange(int[] arr, int target) {
     

     return new int [] {firstOc(arr,target),lastOc(arr,target)};

              
    }

    public int firstOc (int nums[],int t)
    {
        int first =-1;
        int i=0;
        int j = nums.length-1;
        while(i<=j)
        {
            int mid = i +(j-i)/2;
            if(nums[mid]== t )
            {
                first=mid;
                j=mid-1;
            }
             else   if(nums[mid]>t)
                {
                    j=mid-1;
                }
                else {
                    i=mid+1;
                }
            } 
        return first;
    }



    public int lastOc (int nums[],int t)
    {
        int last =-1;
        int i=0;
        int j = nums.length-1;

        while(i<=j)
        {
            int mid = i +(j-i)/2;

            if(nums[mid]== t )
            {
                last=mid;
                i=mid+1;
            }
           else if(nums[mid]>t)
            {
                    j=mid-1;
            }
                else {
                    i=mid+1;
                }
            } 
        return last;
    }
}