class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count = 0;
        int per = capacity;
        for(int i = 0;i<plants.length;i++){
            if(per < plants[i]){
                count += 2*i;
                per = capacity;
            }
            count++;
            per -= plants[i];
        }
        return count;
    }
}