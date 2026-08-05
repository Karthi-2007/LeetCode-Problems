class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String str : emails){
            String[] arr =  str.split("@");
            String local = arr[0];
            String domain = arr[1];
            int index=local.indexOf("+");
            if(index != -1){
            local=local.substring(0,index);
            }
            local=local.replace(".","");
            set.add(local+"@"+domain);
        }
        return set.size();
    }
}