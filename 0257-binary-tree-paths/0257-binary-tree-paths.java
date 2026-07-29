/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root , "");
        return list;
    }

    public List<String> dfs(TreeNode node , String path){

        if(node == null){
            return list;
        }

    if(path.isEmpty()){
         path = String.valueOf(node.val);
    }else{
        path = path + "->" + node.val;
    }

    if(node.left == null && node.right == null){
        list.add(path);
        return list;
    }

    dfs(node.left , path);
    dfs(node.right , path);
     
     return list;
    }
}