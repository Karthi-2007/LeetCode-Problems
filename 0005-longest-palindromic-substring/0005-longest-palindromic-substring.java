class Solution {
    public String longestPalindrome(String s) {
        int maxlen=1;
        String str=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+maxlen;j<=s.length();j++){
                if(pal(s.substring(i,j)) && j-i > maxlen){
                    maxlen=j-i;
                    str=s.substring(i,j);
                }
            }
        }

       return str;

    }
     public static boolean pal(String k){
            int l=0;
            int h=k.length()-1;

            while(l<h){
                if(k.charAt(l)!=k.charAt(h)){
                    return false;
                }
                l++;
                h--;
            }
            return true;
            
        }
}