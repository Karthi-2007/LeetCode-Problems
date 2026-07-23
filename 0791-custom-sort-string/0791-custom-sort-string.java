class Solution {
    public String customSortString(String order, String s) {
        int[] frc=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            frc[ch-'a']++;
        }

        StringBuilder str=new StringBuilder();

        for(char c : order.toCharArray()){
            while(frc[c-'a'] > 0){
                str.append(c);
                frc[c-'a']--;
            }
        }

        for(int i=0;i<26;i++){
            while(frc[i]>0){
            str.append((char)(i+'a'));
            frc[i]--;
            }
        }

        return str.toString();
    }
}