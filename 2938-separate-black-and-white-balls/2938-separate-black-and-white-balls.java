class Solution {
    public long minimumSteps(String s) {
        long total = 0;
        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            while(l < r && s.charAt(l) == '0'){
                l++;
            }
            while(l < r && s.charAt(r) == '1'){
                r--;
            }
            if(l<r){
                total += (r - l);
                l++;
                r--;
            }
        }
        return total;
    }
}