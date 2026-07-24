class Solution {
    public boolean isPalindrome(int x) {
         String str=String.valueOf(x);
         int l=0;
         int r=str.length()-1;
         while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
         }
         return true;
    }
}