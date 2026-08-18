class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count = 0;
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<nums.length;i++){
            
            if(!q.isEmpty() && q.peek() <= i - k){
                q.poll();
            }

            if((nums[i] + q.size()) % 2 == 0){
                if(i + k > nums.length){
                    return -1;
                }

                q.offer(i);
                count++;
            }
            
        }
            
        
        return count;
    }
}