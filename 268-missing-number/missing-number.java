class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        if(nums[len-1]!=len) return len;
        for(int i=0;i<nums.length;i++)
        {
            if(i !=nums[i]) return i;


        }

        return 0;
    }
}