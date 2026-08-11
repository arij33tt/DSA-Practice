class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        int c =0;
        int res=0;

        while (i<s.length() && j < t.length())
        {
            if(s.charAt(i)==t.charAt(j)){
                i++;j++; c++; // 1 ,2 ,
            }
            else i++;
        }

        return t.length()-c;
    }
}