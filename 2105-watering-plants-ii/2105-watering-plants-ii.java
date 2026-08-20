class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i = 0;
        int j = plants.length - 1;
        int per1 = capacityA;
        int per2 = capacityB;
        int count = 0;

        while(i < j){
            if(per1 < plants[i]){
                count++;
                per1 = capacityA;
            }

            per1 -= plants[i];
            i++;

            if(per2 < plants[j]){
                count++;
                per2 = capacityB;
            }

            per2 -= plants[j];
            j--;

        }

        if(i == j){
            int fin = Math.max(per1 , per2);
            if(fin < plants[i]){
                count++;
            }
        }
        return count;
    }
}