package firecode;

public class CountTheLeaves{

    public static void main(String[] args){
        TreeNode node = new TreeNode(1,null,null);
        int nodeCount = numberOfLeaves(node);
        System.out.println(nodeCount);
    }


    public static int numberOfLeaves(TreeNode root) {
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return 1;
        else return numberOfLeaves(root.left) + numberOfLeaves(root.right);
    }
}
