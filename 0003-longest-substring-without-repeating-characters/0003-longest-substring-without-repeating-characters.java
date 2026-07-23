class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int maxlen=0;
        for(int j=0;j<s.length();j++){
            for(int k=i;k<j;k++){
                if(s.charAt(j)==s.charAt(k)){
                    i=k+1;
                    break;
                }
            }
            maxlen=Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}