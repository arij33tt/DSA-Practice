class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans =0;
        for(char ch : stones.toCharArray())
        {
            for(char c : jewels.toCharArray()){
                if(c==ch) ans ++;
            }
        }

        return ans;
    }
}