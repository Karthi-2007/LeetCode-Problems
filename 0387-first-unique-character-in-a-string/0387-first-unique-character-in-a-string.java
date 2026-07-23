class Solution {
    public int firstUniqChar(String s) {
        char[] str=s.toCharArray();
        Map<Character,Integer> m=new HashMap<>();

        for(char c: str){
            m.put(c,m.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(m.containsKey(ch) && m.get(ch)==1){
                   return i;
            }
        }
        return -1;
    }
}