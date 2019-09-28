package firecode;

public class TreeNodeWithoutRecursion{
    /*Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.*/

    public TreeNode findNode(TreeNode root, int val) {
        TreeNode node = root;
        while(node !=null){
            if(node.data == val) return  node;
            else if(node.data > val) node = node.left;
            else node = node.right;
        }
        return null;
    }
}
