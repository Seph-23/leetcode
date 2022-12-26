package breadthfirstsearch.leetcode100;


public class SameTree {

  public static void main(String[] args) {
    TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode q = new TreeNode(1, new TreeNode(3), new TreeNode(2));
    Solution solution = new Solution();
    System.out.println(solution.isSameTree(p, q));
  }

  static class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null && q == null) {
        return true;
      }
      if (p == null || q == null) {
        return false;
      }
      if (p.val == q.val) {
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      }
      return false;
    }
  }
}
