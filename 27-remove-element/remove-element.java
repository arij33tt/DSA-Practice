class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int temp[] = nums; //3,2,2,3
        int l= nums.length;

        for(int i=0;i<l;i++)
        {
            if(temp[i]!=val) // 3 !=3 ? no 
            {
                nums[k++]=temp[i];
                System.out.println(nums[i]);
               
            }
        }

        return k;        
    }
}