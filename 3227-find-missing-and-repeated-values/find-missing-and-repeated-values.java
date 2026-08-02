class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int n  = arr[0].length;

        int missing =0;
        int repeating =0;

              int m =0;
            int r = 0;

        int [] hash  = new int [(n*n)+1];
        
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                hash[arr[i][j]]++;
            }
        }

        for(int i=1;i<hash.length;i++)
        {
            if(hash[i]==0)
            {
                m= i;
                break;
            }
        }

         for(int i=1;i<hash.length;i++)
        {
            if(hash[i]==2)
            {
                r= i;
                break;
            }
        }

        return new int [] {r,m};

    }

    
}