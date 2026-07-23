class Solution {
    public boolean checkIfPangram(String sentence) {
        int frq[]=new int[26];
         
         for(char c:sentence.toCharArray()){
            if(frq[c-'a']==0){
                frq[c-'a']++;
            }
         }

         for(int i=0;i<26;i++){
            if(frq[i]==0){
                return false;
            }
         }
         return true;
    }
}