class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer,Integer> m = new HashMap<>();

        int left = 0;
        int ans = 0;

        for(int right = 0 ; right < fruits.length ; right++){
            m.put(fruits[right],m.getOrDefault(fruits[right],0)+1);

            while(m.size() > 2){
                m.put(fruits[left],m.get(fruits[left]) - 1);

                if(m.get(fruits[left]) == 0){
                    m.remove(fruits[left]);
                }
                left++;
            }
            ans =Math.max(ans , right - left +1);
        }
        return ans;
    }
}