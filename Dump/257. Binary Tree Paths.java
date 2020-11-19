/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        if (root.left == null && root.right == null) {
            result.add("" + root.val);
            return result;
        }
        buildPath(root, "", result);
        return result;
    }
    private void buildPath(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null)
            result.add(path + node.val);
        else {
            if (node.left != null)
                buildPath(node.left,  path + node.val + "->", result);
            if (node.right != null)
                buildPath(node.right, path + node.val + "->", result);
        }
    }
}