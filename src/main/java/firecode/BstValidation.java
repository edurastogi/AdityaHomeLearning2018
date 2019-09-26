package firecode;

public class BstValidation{
    /* Given the root node of a Binary Tree, determine if it is a Binary Search Tree.*/
    public static boolean validateBST(TreeNode root){
        return validateBstWithLimit(root, null, null);
    }


    public static boolean validateBstWithLimit(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        if(min != null && root.data < min || max != null && root.data > max) return false;
        return validateBstWithLimit(root.left, min, root.data) && validateBstWithLimit(root.right, root.data, max);
    }

    /*public static boolean validateBstWithLimit(TreeNode root, int min, int max){
        if(root == null) return true;
        if(root.left == null && root.right == null){
            if(root.data >= min && root.data < max){
                return true;
            }else{
                return false;
            }
        }
        return validateBstWithLimit(root.left, min, root.data) && validateBstWithLimit(root.right, root.data, max);
    }*/
}
