class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;

        int run [] = new int[l];

        run[0]=nums[0];
        int sum=nums[0];
        for(int i =1;i<l;i++)
        {
            sum=sum+nums[i];
            run[i]=sum;
           
        }

        return run;
    }
}