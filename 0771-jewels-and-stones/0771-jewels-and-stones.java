class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> m=new HashMap<>();
        int count=0;
        for(int i=0;i<stones.length();i++){
           char c=stones.charAt(i);
           if(m.containsKey(c)){
               m.put(c,m.getOrDefault(c,0)+1);
           }else{
            m.put(c,1);
           }
        }

        for(int j=0;j<jewels.length();j++){
            char c=jewels.charAt(j);
            if(m.containsKey(c)){
                count+=m.get(c);
            }
        }
        return count;
    }
}