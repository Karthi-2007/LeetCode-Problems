class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int total = 0;
        int first = 0;
        int second = 0;

        while(l < r){
            first = Math.max(first,height[l]);
            second = Math.max(second,height[r]);
            if(first < second){
                total += first - height[l];
                l++;
            }else{
                total += second - height[r];
                r--;
            }
        }
        return total;
    }
}