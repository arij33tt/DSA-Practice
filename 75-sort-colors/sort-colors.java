class Solution {
    public void sortColors(int[] nums) {
        int [] temp = nums;

        int k =0;int z=0;
        int o=0;int t=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0) z++;
            else if(nums[i]==1) o++;
            else if(nums[i]==2) t++;


        }

        while(z>0)
        {
            nums[k++]=0;
            z--;
        }

        while(o>0){
            nums[k++]=1;
            o--;
        }

        while(t>0)
        {
            nums[k++]=2;
            t--;
        }


    }
}