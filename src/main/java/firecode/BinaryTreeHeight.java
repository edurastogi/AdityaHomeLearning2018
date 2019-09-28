package firecode;

public class BinaryTreeHeight{
/*    Given a binary tree, write a method to find its height recursively.
    An empty tree has a height of 0.*/

    public int findHeight(TreeNode root) {
        if(root == null) return 0;
        int left = findHeight(root.left);
        int right = findHeight(root.right);
        return 1 + (left > right ? left : right);
    }


    public int findHeight2(TreeNode root) {
        if(root == null) return 0;
        else return 1 + Math.max(findHeight2(root.left),findHeight2(root.right));
    }
}
