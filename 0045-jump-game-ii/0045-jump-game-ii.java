class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int currentend=0;
        int fast=0;
        for(int i=0;i<nums.length-1;i++){
            fast=Math.max(fast,i+nums[i]);
            if(i==currentend){
                jumps++;
                currentend=fast;
            }
        }
        return jumps;
    }
}