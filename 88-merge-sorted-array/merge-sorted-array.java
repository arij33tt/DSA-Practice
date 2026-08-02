class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] res = new int [m+n];
        int k=0;
        int i=0;
        int j=0;

        while (i < m && j <n)
        {
            if(nums1[i]<nums2[j])
            {
                res[k++]=nums1[i++];
            }

            else {
                res[k++]= nums2[j++];
            }
        }

        while (i<m)
        {
            res[k++]= nums1[i++];
        }

        while(j<n)
        {
            res[k++]= nums2[j++];
        }
        int h =0;
        for(int e : res)
        {
            nums1[h++]= e;
        }
        System.out.println(Arrays.toString(res));
    }
}