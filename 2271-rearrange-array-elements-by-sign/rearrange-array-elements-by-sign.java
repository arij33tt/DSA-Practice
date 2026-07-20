class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] temp = new int [nums.length];

        int pk=0;
        int nk=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                temp[pk]=nums[i];
                pk=pk+2;
            }
            else if(nums[i]<0)
            {
                temp[nk]=nums[i];
                nk=nk+2;
            }

        }
System.gc();
        return temp;

       
    }
}