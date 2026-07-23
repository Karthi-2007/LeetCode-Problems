class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] str=sentence.split(" ");
        Set<String> set=new HashSet<>(dictionary);
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<str.length;i++){
            String replace=str[i];

            for(int j=1;j<=replace.length();j++){
                String newword=replace.substring(0,j);

                if(set.contains(newword)){
                    replace=newword;
                    break;
                    
                }
                
            }
          
            result.append(replace).append(" ");
           
        }
      return result.toString().trim();
    }
}