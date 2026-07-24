class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
         int original=x;
         int reverse=0;
         while(x>0){
            int a=x%10;
            reverse=reverse*10+a;
            x/=10;
         }
          if(original==reverse){
            return true;
          
         }
         return false;
    }
}