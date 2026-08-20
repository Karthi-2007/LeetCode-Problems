class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int i = 0;
        int count = 0;
        int maxlen = 0;
        for(int j = 0;j < s.length(); j++){
            arr[s.charAt(j) - 'A'] += 1;
            count = Math.max(count , arr[s.charAt(j) - 'A']);

            while((j - i + 1) - count > k){
                arr[s.charAt(i) - 'A'] -= 1;
                i++;
            }
            maxlen = Math.max(maxlen , (j - i +1));
        }
        return maxlen;
    }
}