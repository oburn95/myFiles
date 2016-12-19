/*
a program that reads from a text file and counts the number of instances of a word occuring
it then adds that word to a binary tree and keeps track of the frequency of
each word
 */
package textprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import trees.BinaryTree;
import trees.BinaryTreeCreationException;

/**
 *
 * @author Sean
 */
public class TreeFrequencyCounter {

    /**
     * @param args the command line arguments
     * @throws trees.BinaryTreeCreationException
     */
    public static void main(String[] args) throws BinaryTreeCreationException {
        File wordFile = getWordFile();
        ArrayList<String> words = getWords(wordFile);
        BinaryTree<String, Integer> frequencyTree = getTree(words);
        frequencyTree.inorder();
    }

  
    private static File getWordFile() {
        System.out.println("Please enter a song");
        String s = new Scanner(System.in).nextLine();
        String d = "C:/Users/Sean/Documents/NetBeansProjects/CS2F16/";
        return new File(d + s + ".txt");
    }


    private static ArrayList<String> getWords(File wordFile) {
        ArrayList<String> fileWords = new ArrayList<>(1);
        Scanner fr = haveScanner(wordFile);
        while (fr.hasNext()) {
            fileWords.add(fr.next().toLowerCase());
        }
        return fileWords;
    }

   
    private static Scanner haveScanner(File wordFile) {
        try {
            return new Scanner(wordFile);
        } catch (FileNotFoundException ex) {
            System.err.println("File does not exist");
            System.exit(1);
            return null;
        }
    }

   
    private static BinaryTree<String, Integer> getTree(ArrayList<String> words)
            throws BinaryTreeCreationException {
        
        BinaryTree<String, Integer> wordTree = new BinaryTree<>();
        for (String word : words) {
            if (wordTree.member(word)) {
                BinaryTree<String, Integer> counterTree = wordTree.find(word);
                counterTree.setValue(counterTree.value() + 1);
            } else {
                wordTree.addST(word, 1);
            }
        }
        return wordTree;
    }

}


    

