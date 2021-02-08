package array;

import java.util.Arrays;

public class _106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int i_len = inorder.length;
        int p_len = postorder.length;
        if(i_len==0||p_len==0) return null;
        TreeNode root = new TreeNode(postorder[p_len-1]);//构建根节点
        int i;
        for (i = 0; i < i_len; i++) {
            if(inorder[i]==postorder[p_len-1]) break;//找到根节点在中序遍历中的位置
        }
        int[] left_in = Arrays.copyOfRange(inorder,0,i);
        int[] left_post = Arrays.copyOfRange(postorder,0,i);
        root.left = buildTree(left_in,left_post);

        int[] right_in = Arrays.copyOfRange(inorder,i+1,i_len);
        int[] right_post = Arrays.copyOfRange(postorder,i,p_len-1);//注意这个范围
        root.right = buildTree(right_in,right_post);

        return root;
    }
}

