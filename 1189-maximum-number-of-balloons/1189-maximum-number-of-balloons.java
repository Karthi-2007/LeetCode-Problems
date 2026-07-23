class Solution {
    public int maxNumberOfBalloons(String text) {
         int[] frq=new int[26];

        for(char c : text.toCharArray()){
            frq[c-'a']++;
        }

       int b=frq['b'-'a'];
       int a=frq['a'-'a'];
       int l=frq['l'-'a']/2;
       int o=frq['o'-'a']/2;
       int n=frq['n'-'a'];

       return Math.min(Math.min(a,b),Math.min(Math.min(l,o),n));
    }
}