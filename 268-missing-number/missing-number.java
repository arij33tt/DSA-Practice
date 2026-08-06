class Solution {
    public int missingNumber(int[] nums) {
     int actual_sum = 0;
    int expected_sum=0;

    int n = nums.length;

    actual_sum = (n*(n+1))/2;

    for(int i=0;i<n;i++){
        expected_sum+=nums[i];
    }


    return actual_sum - expected_sum;      
       
        }
}