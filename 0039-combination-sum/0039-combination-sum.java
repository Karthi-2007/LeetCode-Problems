class Solution {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

    public void solve(int[] candidates , int target,int start){
        if(target == 0){
            list.add(new ArrayList<>(li));
            return;
        }

        for(int i = start;i<candidates.length;i++){
            if(candidates[i] > target) return;

            li.add(candidates[i]);
            solve(candidates,target - candidates[i],i);
            li.removeLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates , target , 0);
        return list;
    }
}