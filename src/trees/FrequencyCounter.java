/*

 */
package trees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class FrequencyCounter {

   
    public static void main(String[] args) throws FileNotFoundException, BinaryTreeCreationException {
        File wordFile = getFile();
        ArrayList<String> words = getWords(wordFile);
        BinaryTree<String, Integer> tree = makeTree(words);
        tree.inorder();
    }

    private static File getFile() {
        System.out.println("Please enter a song or a poem");
        String d = new Scanner(System.in).nextLine();
        String dr = "C:/Users/Sean/Documents/NetBeansProjects/CS2F16/";
        return new File(dr + d + ".txt");
    }

  
    private static ArrayList<String> getWords(File textFile) {
        ArrayList<String> words = new ArrayList<>(1);
        Scanner reader = getScanner(textFile);
        while (reader.hasNext()) {
            words.add(reader.next().toLowerCase());
        }
        return words;
    }


    private static Scanner getScanner(File textFile) {
        try {
            return new Scanner(textFile);
        } catch (FileNotFoundException ex) {
            System.err.println("File does not exist");
            System.exit(1);
            return null;
        }
    }

    private static BinaryTree<String, Integer> makeTree(ArrayList<String> words)
            throws BinaryTreeCreationException {
        BinaryTree<String, Integer> wordTree = new BinaryTree<>();
        for (String word : words) {
            if (wordTree.member(word)) {
                BinaryTree<String, Integer> node = wordTree.find(word);
                node.setValue(node.value() + 1);
            } else {
                wordTree.addST(word, 1);
            }
        }
        return wordTree;
    }

}
