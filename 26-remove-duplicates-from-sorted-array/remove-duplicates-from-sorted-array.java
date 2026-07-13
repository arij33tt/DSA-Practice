class Solution {
    public int removeDuplicates(int[] nums) {

            int temp[] = nums;



        int k=1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(temp[i-1]!=temp[i])
            {
                nums[k]=temp[i];
                k++;
            }
        }

        return k;
    }
}