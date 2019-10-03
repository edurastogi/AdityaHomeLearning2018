package firecode;


import java.util.ArrayList;
import java.util.Stack;

public class TreeNodeWithoutRecursion{
    /*Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.*
     Since this is binary tree not balanced binary tree, below moethd will not work

     */

    public TreeNode findNode(TreeNode root, int val) {
        TreeNode node = root;
        while(node !=null){
            if(node.data == val) return  node;
            else if(node.data > val) node = node.left;
            else node = node.right;
        }
        return null;
    }

    public TreeNode findNodeSecondTry(TreeNode root, int val){
        if(root == null) return null;
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        nodeStack.push(root);
        while(nodeStack.size() > 0){
            TreeNode node = nodeStack.pop();
            if(node.data == val) return node;
            else{
                if(node.left !=null) nodeStack.push(node.left);
                if(node.right!=null) nodeStack.push(node.right);
            }
        }
        return null;
    }
}
