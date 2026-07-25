class Solution {
    public int trap(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int total = 0;
        int first = 0;
        int second = 0;
        while(low < high){
            first = Math.max(first , height[low]);
            second = Math.max(second , height[high]);
            if(first < second){
                total += first - height[low];
                low++;
            }else{
                total+= second - height[high];
                high--;
            }
        }
        return total;
    }
}