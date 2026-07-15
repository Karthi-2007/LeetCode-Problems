class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new HashSet<>();
        for(String s: banned){
            set.add(s);
        }

        String normal=paragraph.toLowerCase().replaceAll("[!?',;.]"," ");
        String[] str=normal.split("\\s+");

        Map<String,Integer> map=new HashMap<>();
        for(String s: str){
            if(!s.isEmpty() && !set.contains(s)){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }

        String maxele="";
        int maxcount=0;
        for(Map.Entry<String,Integer> it: map.entrySet()){
            if(it.getValue()>maxcount){
                maxele=it.getKey();
                maxcount=it.getValue();
            }
        }
        return maxele;
    }
}