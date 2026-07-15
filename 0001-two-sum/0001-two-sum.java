class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(ans.containsKey(complement)){
                return new int[]{ans.get(complement),i};
            }
            ans.put(nums[i],i);
        }
        return new int[]{};
    }
}