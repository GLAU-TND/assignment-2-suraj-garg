/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int i = 7;
        while (i > 0) {
            tree.add(scanner.nextInt());
            i--;
        }

       /*tree looks like
                    4
                  /  \
                2      6
               / \    / \
              1   3  5   7
           */
        //Running Pre Order and Post Order Traversals
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

/* The result is :
    4 2 1 3 6 5 7
    1 3 2 5 7 6 4
    So , a is correct and b is not.*/
    }
}
