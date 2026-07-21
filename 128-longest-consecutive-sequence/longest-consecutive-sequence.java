class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;

        int temp=0;

        Arrays.sort(nums);
        if(nums.length==0) return 0;

        

        for(int i=0;i<nums.length-1;i++)
        {   int ele = nums[i];

        if(nums[i]==nums[i+1]){
            continue;
        }
            if(nums[i+1] == ele+1){
                temp++;
                max= Math.max(temp,max);
            }
            

            else temp=0;
        }
        return max+1;
    }
}