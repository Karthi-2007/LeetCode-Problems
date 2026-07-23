class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }
           int start=0;
           boolean down=false;
           List<StringBuilder> m=new ArrayList<>();

           for(int i=1;i<=numRows;i++){
            m.add(new StringBuilder());
           }

           for(char ch: s.toCharArray()){
               m.get(start).append(ch);
            if(start==0 || start==numRows-1){
                down=!down;
            }
            start+=down ? 1 : -1;
           }

           StringBuilder str=new StringBuilder();
           for(StringBuilder a: m){
            str.append(a);
           }
           return str.toString();
    }
}