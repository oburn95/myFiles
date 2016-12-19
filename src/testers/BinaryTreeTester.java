/*
BinaryTree tester class used mainly to maked sure that the three 
different methods of adding to the tree are working correctly
 */
package testers;

import trees.BinaryTree;
import trees.BinaryTreeCreationException;

/**
 *
 * @author Sean
 */
public class BinaryTreeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BinaryTreeCreationException {
        testLR();
        testST();
        testND();

    }

    private static void testLR() {
        System.out.println("Test LR ...");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> creating empty tree. ");
        System.out.println(">>> adding elements to the tree directionally");
        try {
            t.addLR("lion", null, "");
            t.addLR("shark", null, "r");
            t.addLR("elephant", null, "l");
            t.addLR("zebra", null, "rr");
            t.addLR("alligator", null, "ll");
            t.addLR("ardvaark", null, "llr");
            t.addLR("tiger", null, "rrl");
            t.addLR("giraffe", null, "lr");
            t.addLR("bear", null, "llrr");
            t.addLR("snake", null, "rrll");

        } catch (BinaryTreeCreationException ex) {
            ex.printStackTrace();
        }
        System.out.println(">>> PREORDER");
        t.preorder();
        System.out.println(">>> INORDER");
        t.inorder();
        System.out.println(">>> POSTORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height());
    }

    private static void testST() throws BinaryTreeCreationException {
        System.out.println("Test BST ...");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> Creating empty tree. ");
        System.out.println(">>> Adding elements to the empty binary tree ...");
        t.addST("lion", null);
        t.addST("shark", null);
        t.addST("elephant", null);
        t.addST("zebra", null);
        t.addST("alligator", null);
        t.addST("ardvaark", null);
        t.addST("tiger", null);
        t.addST("giraffe", null);
        t.addST("bear", null);
        t.addST("snake", null);

        System.out.println(">>> PREORDER");
        t.preorder();
        System.out.println(">>> INORDER");
        t.inorder();
        System.out.println(">>> POSTORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height());
    }

    private static void testND() {
        System.out.println("Test ND...");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> Creating empty tree. ");
        System.out.println(">>> Adding elements to the tree nondeterministaclly ...");
        t.addND("lion", null);
        t.addND("shark", null);
        t.addND("elephant", null);
        t.addND("zebra", null);
        t.addND("alligator", null);
        t.addND("ardvaark", null);
        t.addND("tiger", null);
        t.addND("giraffe", null);
        t.addND("bear", null);
        t.addND("snake", null);

        System.out.println(">>> PREORDER");
        t.preorder();
        System.out.println(">>> INORDER");
        t.inorder();
        System.out.println(">>> POSTORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height());
    }
}
