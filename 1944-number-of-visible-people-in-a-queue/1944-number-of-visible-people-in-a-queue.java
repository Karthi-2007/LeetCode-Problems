class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i] > heights[st.peek()]){
                st.pop();
                res[i]++;
            }

            if(!st.isEmpty()){
                res[i]++;
            }
            st.push(i);
        }
        return res;
    }
}