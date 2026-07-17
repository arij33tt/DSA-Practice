class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int oc=0;
        int [] res = new int [q.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                list.add(i);
                oc++;
            }
        }

        for(int i=0;i<q.length;i++)
        {
            if(oc<q[i]){
                res[i]=-1;

            }

            else{
                res[i]=list.get(q[i]-1);
            }
        }

        return res;
    }
}