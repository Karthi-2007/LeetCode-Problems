class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str.append(c);
            }
        }
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(Character.toLowerCase(str.charAt(l))!=Character.toLowerCase(str.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}