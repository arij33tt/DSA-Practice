class Solution {
    public int missingNumber(int[] nums) {
      int xor1=0;
        int xor2=0;

        int n = nums.length+1;

        int len = nums.length;

        for(int i=0;i<n ;i++)
        {
            xor1^=i;
        }

        for(int i=0;i<len;i++)
        {
            xor2^=nums[i]; 
        }

        return xor1^xor2;

       
       
        }
}