class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();

        for(int i : nums1){
            m.put(i,m.getOrDefault(i,0)+1);
        }
       List<Integer> result = new ArrayList<>();
        for(int j : nums2){
            if(m.containsKey(j) && m.get(j)>0){
                result.add(j);
                m.put(j,m.get(j)-1);
            }
        }
      int[] arr = new int[result.size()];

      for(int i=0;i<arr.length;i++){
        arr[i]=result.get(i);
      }
        return arr;
    }
}