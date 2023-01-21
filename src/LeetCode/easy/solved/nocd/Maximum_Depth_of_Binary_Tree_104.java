package LeetCode.easy.solved.nocd;

public class Maximum_Depth_of_Binary_Tree_104{
    int maxNumber=0;
    public int maxDepth(TreeNode root) {
        nextNode(root, 1);
        return maxNumber;
    }
    public void nextNode(TreeNode node,int maxAtr){
        maxAtr++;
        if(maxNumber<maxAtr){
            maxNumber=maxAtr;
        }
        if(node.right!=null){
            nextNode(node.right, maxAtr);
        }
        if(node.left!=null)
            nextNode(node.left, maxAtr);

    }
    
}