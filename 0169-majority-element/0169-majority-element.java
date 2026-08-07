class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
       int candidate = nums[0];

       for(int i=0;i<nums.length;i++){
            if(candidate == nums[i]){
                count++;
            }else if(count == 0){
                 candidate = nums[i];
            }else{
                count--;
            }
       } 

       return candidate;
    }
}