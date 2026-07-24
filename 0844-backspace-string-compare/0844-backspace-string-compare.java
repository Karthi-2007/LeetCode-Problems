class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String s){
        StringBuilder str=new StringBuilder();

        for(char c : s.toCharArray()){
            if(c != '#'){
                str.append(c);
            }else if(str.length() > 0){
                str.deleteCharAt(str.length()-1);
            }
        }
        return str.toString();
    }
}