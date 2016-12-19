/*
instead of adding different kinds of animals to the tree this
testing class adds colors and adds them to the tree directionally
 */
package trees;

/**
 *
 * @author Sean
 */
public class BinaryTreeStudentTester {

    /**
     * @param args the command line arguments
     * @throws trees.BinaryTreeCreationException
     */
    public static void main(String[] args) throws BinaryTreeCreationException {
        testLR();
       

    }

    private static void testLR() {
        System.out.println("Test LR ...");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> creating empty tree. ");
        System.out.println(">>> adding elements to the tree directionally");
        try {
            t.addLR("red", null, "");
            t.addLR("blue", null, "l");
            t.addLR("green", null, "lr");
            t.addLR("black", null, "ll");
            t.addLR("white", null, "r");
            t.addLR("purple", null, "lrr");
            t.addLR("yellow", null, "rr");
            t.addLR("orange", null, "lrrl");
            t.addLR("indigo", null, "lrrll");
            t.addLR("aqua", null, "lll");
            t.addLR("tangerine", null, "rl");
            t.addLR("pink", null, "lrrlr");
            t.addLR("ghostwhite", null, "lrl");
            t.addLR("gray", null, "lrlr");
            t.addLR("brown", null, "lrll");
            t.addLR("gainsboro", null, "lrlll");

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
 


   
    
}
