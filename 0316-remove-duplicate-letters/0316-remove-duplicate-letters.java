class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last=new int[26];

        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }

        boolean[] visited=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(visited[ch-'a']){
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && last[stack.peek() - 'a'] > j) {

                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack)
            ans.append(c);

        return ans.toString();
        
       
    }
}