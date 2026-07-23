class Solution {
    public int countCharacters(String[] words, String chars) {
        int count=0;
        int sum=0;
        for(String s : words){
             String temp=chars;
             for(char c : s.toCharArray()){
                if(temp.contains(String.valueOf(c))){
                    count++;
                    int index=temp.indexOf(c);
                    temp=temp.substring(0,index)+temp.substring(index+1);
                }
               
             }
              if(count==s.length()){
                    sum+=count;   
                }
                count=0;
            }
            return sum;
        }
        
    }
