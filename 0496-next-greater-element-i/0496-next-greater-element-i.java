class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> m = new HashMap<>();

        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                m.put(st.pop(),num);
            }

            st.push(num);
        }

        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            ans[i] = m.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}