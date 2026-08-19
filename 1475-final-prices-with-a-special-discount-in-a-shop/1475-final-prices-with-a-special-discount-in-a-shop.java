class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        int n = prices.length;
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && prices[i] < prices[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = prices[i] - prices[st.peek()];
            }else{
                ans[i] = prices[i];
            }

            st.push(i);
        }

        return ans;
    }
}