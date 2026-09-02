class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();

        for(char c : num.toCharArray()){
            while(k > 0 && !st.isEmpty() && st.peek() > c){
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(k > 0 && !st.isEmpty()){
                st.pop();
                k--;
        }

        StringBuilder str = new StringBuilder();
        for(char a : st){
            str.append(a);
        }

        int index = 0;
        while(index < str.length() && str.charAt(index) == '0'){
            index++;
        }

        String result = str.substring(index);

        return result.isEmpty() ? "0" : result;
    }
}