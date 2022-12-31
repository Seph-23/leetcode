package deapthfirstsearch.leetcode94;

import breadthfirstsearch.leetcode100.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        in(root,res);
        return res;
    }

    public void in(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        in(root.left,res);
        res.add(root.val);
        in(root.right,res);
    }
}

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