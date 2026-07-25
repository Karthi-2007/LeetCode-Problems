class Solution {
    public int countPoints(String rings) {
       boolean[][] result=new boolean[10][3];

       for(int i=0;i<rings.length();i+=2){
        char color=rings.charAt(i);
        int index=rings.charAt(i+1)-'0';

        if(color == 'R'){
            result[index][0]=true;
        }else if(color == 'G'){
            result[index][1]=true;
        }else{
            result[index][2]=true;
        }

        }
        int count=0;
        for(int i=0;i<10;i++){
            if(result[i][0] && result[i][1] && result[i][2]){
                count++;
            }
       }
       return count;
    }
}