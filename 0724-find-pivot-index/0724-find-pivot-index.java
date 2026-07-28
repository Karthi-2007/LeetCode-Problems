class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumleft=new int[nums.length];
        int[] sumright=new int[nums.length];

        sumleft[0]=0;
        sumright[nums.length-1]=0;

        for(int i=1;i<nums.length;i++){
            sumleft[i]=sumleft[i-1] + nums[i-1];
        }

        for(int j=nums.length-2;j>=0;j--){
            sumright[j]=sumright[j+1] + nums[j+1];
        }
        for(int i=0;i<nums.length;i++){
            if(sumleft[i]==sumright[i]){
                return i;
            }
        }

        return -1;
    }
}