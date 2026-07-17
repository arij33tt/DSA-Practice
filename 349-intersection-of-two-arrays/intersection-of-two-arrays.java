class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                Set<Integer> list = new HashSet<>();


        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i =0;
        int j=0;

        while (i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                list.add(nums1[i]);
                i++;j++;
            }
            else if((nums1[i]<nums2[j]))
            {
                i++;
            }
            else if (nums1[i]>nums2[j])
            {
                j++;
            }
        }
        int [] res = new int[list.size()];
        int k=0;
        for(int x:list)
        {
            res[k++]=x;
        }


        return res;

    }
}