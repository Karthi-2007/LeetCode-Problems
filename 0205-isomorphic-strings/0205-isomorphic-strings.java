class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

       int[] ma = new int[256];
       int[] sa = new int[256];

        for(int i=0;i<s.length();i++){
           char mc = s.charAt(i);
           char sc = t.charAt(i);

           if(ma[mc] != sa[sc]){
            return false;
           }

           ma[mc] = i+1;
           sa[sc] = i+1;
        }
        return true;
    }
}