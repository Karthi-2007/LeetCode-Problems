class Solution {
    public int missingInteger(int[] nums) {
        int prefixsum = nums[0];
        for(int i = 1;i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                prefixsum += nums[i];
            }else{
                break;
            }
        }

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        while(set.contains(prefixsum)){
            prefixsum++;
        }

        return prefixsum;
    }
}