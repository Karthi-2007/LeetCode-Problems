class Solution {
    public String removeStars(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                str.append(ch);
            }else if(str.length() > 0){
                str.deleteCharAt(str.length()-1);
            }
        }
        return str.toString();
    }
}