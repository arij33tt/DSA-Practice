class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int [] t1 = new int [m];
        int [] t2 = new int [n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    t1[i]=1;
                    t2[j]=1;

                }
            }
        }
// now marking 0 

for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if(t1[i]==1 || t2[j]==1)
        {
            arr[i][j]=0;
        }
    }
}






    }
}