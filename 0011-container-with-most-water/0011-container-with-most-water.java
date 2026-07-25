class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int maxarea = 0;
        while(low < high){
            int Height = Math.min(height[low],height[high]);
            int weidth = high-low;
            int max = Height * weidth;
            maxarea = Math.max(max , maxarea);
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxarea;
    }
}