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

    boolean answer = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        
        findOutSameTree(p, q);
        return answer;
    }

    private void findOutSameTree(TreeNode p, TreeNode q) {
        if(!answer) return;

        if(p.val != q.val) {
            answer = false;
            return;
        }

        if(p.left != null && q.left != null) {
            findOutSameTree(p.left, q.left);
        } else if (p.left != null || q.left != null)  {
            answer = false;
            return;
        }

        if(p.right != null && q.right != null) {
            findOutSameTree(p.right, q.right);
        } else if (p.right != null || q.right != null) {
            answer = false;
            return;
        }
    }
}