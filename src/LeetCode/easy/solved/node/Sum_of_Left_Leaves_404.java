package LeetCode.easy.solved.node;

public class Sum_of_Left_Leaves_404 {
    public static void main(String[] args) {
        Sum_of_Left_Leaves_404 sum_of_Left_Leaves_404=new Sum_of_Left_Leaves_404();
        System.out.println(sum_of_Left_Leaves_404.sumOfLeftLeaves(new TreeNode(0,new TreeNode(2,new TreeNode(1,new TreeNode(5),new TreeNode(1)),null),new TreeNode(4,new TreeNode(3,null,new TreeNode(6)),new TreeNode(-1,null,new TreeNode(8))))));
    }
    
int leftWay=0;
public int sumOfLeftLeaves(TreeNode root) {
    if(root!=null){
        rightSide(root);
    }
    return leftWay;
}
public void counterLeftLeaves(TreeNode node){
      if(node.left==null){
        if(node.right==null)
           leftWay+=node.val;
      }
      else{
          counterLeftLeaves(node.left);
      }
      if(node.right!=null){
        rightSide(node.right);
      }
   
}
public void  rightSide(TreeNode node){
    if(node.left!=null){
        counterLeftLeaves(node.left);
        }
        if(node.right!=null){
          rightSide(node.right);
        }
}
}
