class Solution {
    public int maxProduct(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int pro=(nums[i]-1)*(nums[j]-1);
                 sum=Math.max(sum,pro);
            }
        }
       return sum;
    }
}