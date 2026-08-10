class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }
        int index = 0;
        Arrays.sort(strs);

        String first = strs[0];
        String second = strs[strs.length - 1];

        while(index < first.length() && index < second.length()){
            if(first.charAt(index) == second.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return first.substring(0,index);
    }
}