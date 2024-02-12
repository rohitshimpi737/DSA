package com.Rohit.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*   BinaryTree tree = new BinaryTree();
      Scanner scanner = new Scanner(System.in);
       tree.populate(scanner);
       tree.prettyDisplay();*/

       BST tree=new BST();
       int []nums={15,10,1,2,3,4,5,7};
       tree.populate(nums);
       tree.display();
       tree.levelOrder();

        }
     /*   AVL tree=new AVL();
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(12);
        tree.insert(7);
        tree.display();
        System.out.println( tree.balanced());
     */
//                int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};;
//                SegmentTree tree = new SegmentTree(arr);
//                 tree.display();
//                tree.update(0,5);
//                System.out.println(tree.query(0, 1));

            }

