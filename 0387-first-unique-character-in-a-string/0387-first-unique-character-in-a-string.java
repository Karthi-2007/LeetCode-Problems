class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,-1);
            }else{
                map.put(c,i);
            }
        }

        int max=0;
        for(Map.Entry<Character,Integer> it: map.entrySet()){
            if(it.getValue()!=-1){
                return it.getValue();
            }
        }
        return -1;
    }
}