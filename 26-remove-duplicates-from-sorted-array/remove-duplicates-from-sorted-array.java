class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int [] temp = nums;

        for(int i=1;i<temp.length;i++){

            if(temp[i-1]!=temp[i]){
                nums[k++]=temp[i];
            }
        }

        return k;
    }
}