/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],

 	3
   / \
  9  20
    /  \
   15   7

return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
*/

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List Result = new ArrayList();
        if(root ==  null)
            return Result;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            ArrayList<Integer> lavel = new ArrayList<Integer>();
            int size = queue.size();
            
            for(int i =0; i<size; i++){
                TreeNode head = queue.poll();
                lavel.add(head.val);
                if(head.left != null){
                    queue.offer(head.left);
                }
                if(head.right !=  null){
                    queue.offer(head.right);
                }
            }
            Result.add(0,lavel);
        }
        
        return Result;
    }
}