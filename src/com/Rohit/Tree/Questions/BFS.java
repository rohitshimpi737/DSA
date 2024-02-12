package com.Rohit.Tree.Questions;

import com.Rohit.Tree.BST;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        }
//    public static List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> result  =new ArrayList<>();
//
//        if(root ==null) return  result;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while ((queue.isEmpty())){
//            int levelSize= queue.size();
//            List<Integer> currentLevel  =new ArrayList<>(levelSize);
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode curentNode =queue.poll();
//                currentLevel.add(curentNode.val);
//                if(curentNode.left!=null) {
//                    queue.offer(curentNode.left);
//                }
//                if(curentNode.right!=null) {
//                    queue.offer(curentNode.right);
//                }
//            }
//            result.add(currentLevel);
//        }
//        return result;
//    }
}
