class Solution {
    public long minimumSteps(String s) {
        long total = 0;
        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            if(s.charAt(l) == '0'){
                l++;
            }else if(s.charAt(r) == '1'){
                r--;
            }else{
                total += (r - l);
                l++;
                r--;
            }
        }
        return total;
    }
}