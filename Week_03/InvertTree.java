package Week_03;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        //teminator
        if (root == null) {
            return null;
        }
        //process
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;

        //drill down
        invertTree(left);
        invertTree(right);
        // resort current state

        return root;

    }
}
