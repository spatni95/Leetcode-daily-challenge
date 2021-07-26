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
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        inOrder(root, list);
        return balancedTree(list, 0, list.size() - 1);   
    }
    
    public void inOrder(TreeNode root, List<TreeNode> list){
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root);
        inOrder(root.right, list);
    }
    
    public TreeNode balancedTree(List<TreeNode> list, int start, int end){
        if(start > end) return null;
        int mid = start + (end - start)/2;
        TreeNode root = list.get(mid);
        root.left = balancedTree(list, start, mid - 1);
        root.right = balancedTree(list, mid + 1, end);
        return root;
    }
}