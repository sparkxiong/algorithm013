package Week_03;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0 || preorder.length > inorder.length) {
            return null;
        }
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {

        //timenator
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        //process
        //前序遍历第一个节点为根结点
        TreeNode root = new TreeNode(preorder[pStart]);
        //找出根结点在中序遍历的位置 index
        int index = 0;
        while (preorder[pStart] != inorder[iStart + index]) index++;

        //drill down
        //重建左子树，右子树
        root.left = helper(preorder, pStart + 1, pStart + index, inorder, iStart, iStart + index - 1);
        root.right = helper(preorder, pStart + index + 1, pEnd, inorder, iStart +index+1,iEnd );
        return root;
    }
}
