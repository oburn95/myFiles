/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Sean
 */
public class multiWaySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = readWords();
        displayWordsInOrder("Initial Order of the Words: ", words);
        ArrayList<LinkedList<String>> passOneWords = sortPassOneWords(words);
        displayQueues("\n\nPass 1 queues:", passOneWords);
        ArrayList<String> betweenPassOrder = combineQueues(passOneWords);
        displayWordsInOrder("\nBetween Pass Order: ", betweenPassOrder);
        ArrayList<LinkedList<String>> passTwoWords = sortPassTwoWords(betweenPassOrder);
        displayQueues("\n\nPass 2 queues:", passTwoWords);
        ArrayList<String> afterFinalPassOrder = combineQueues(passTwoWords);
        displayWordsInOrder("\nFinal Order: ", afterFinalPassOrder);
    }

    private static ArrayList<String> readWords() throws FileNotFoundException {
        String homedir = System.getProperty("user.home");
        System.out.println("homedir = " + homedir);
        String dirname = homedir + "/Data/";
        JFileChooser jfc = new JFileChooser(new File(dirname));
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        Scanner scanner = new Scanner(file);
        ArrayList<String> words = new ArrayList<String>();
        while (scanner.hasNext()) {
            words.add(scanner.next().toLowerCase());
        }
        return words;
    }

    private static void displayWordsInOrder(String statement, ArrayList<String> words) {
        System.out.println(statement);
        int i = 0;
        int x = 0;
        for (String word : words) {
            System.out.print(word + " ");
            i = i + 1;
            x = x + 1;
            if (x > 10) {
                System.out.println();
                x = x - 10;
            }
        }
    }

    private static ArrayList<LinkedList<String>> sortPassOneWords(ArrayList<String> words) {
        ArrayList<LinkedList<String>> queues = makeQueues(highestVowelCount(words));
        ArrayList<Integer> vowelCount = createVowelArray(words);
        for (int i = 0; i <= words.size() - 1; i = i + 1) {
            for (int n = 0; n <= queues.size() - 1; n = n + 1) {
                if (vowelCount.get(i) == n) {
                    queues.get(n).add(words.get(i));
                }
            }
        }
        return queues;
    }

    private static ArrayList<LinkedList<String>> makeQueues(int number) {
        ArrayList<LinkedList<String>> queues = new ArrayList<LinkedList<String>>(number);
        for (int i = 0; i <= number; i = i + 1) {
            queues.add(new LinkedList<>());
        }
        return queues;
    }

    private static int highestVowelCount(ArrayList<String> words) {
        int maxVowels = 0;
        ArrayList<Integer> vowels = createVowelArray(words);
        for (int i = 0; i <= vowels.size() - 1; i = i + 1) {
            if (vowels.get(i) > maxVowels) {
                maxVowels = vowels.get(i);
            }
        }
        return maxVowels + 1;
    }

    private static ArrayList<Integer> createVowelArray(ArrayList<String> words) {
        ArrayList<Integer> vowelCount = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <= words.size() - 1; i = i + 1) {
            String word = words.get(i);
            for (char c : word.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count = count + 1;
                }
            }
            vowelCount.add(count);
            count = count - count;
        }
        return vowelCount;
    }

    private static void displayQueues(String statement, ArrayList<LinkedList<String>> queues) {
        System.out.println(statement);
        for (int i = 0; i < queues.size() - 1; i = i + 1) {
            if (!queues.get(i).isEmpty()) {
                System.out.println(queues.get(i).toString() + " ");
            }
        }
    }

    private static ArrayList<String> combineQueues(ArrayList<LinkedList<String>> passOneWords) {
        ArrayList<String> combinedQueues = new ArrayList<>();
        for (int i = 0; i <= passOneWords.size() - 1; i = i + 1) {
            combinedQueues.addAll(passOneWords.get(i));
        }
        return combinedQueues;
    }

    private static ArrayList<LinkedList<String>> sortPassTwoWords(ArrayList<String> betweenPassOrder) {
        ArrayList<LinkedList<String>> queues = makeQueues(findLongestWord(betweenPassOrder));
        ArrayList<Integer> lengthCount = createLengthsArray(betweenPassOrder);
        for (int i = 0; i <= betweenPassOrder.size() - 1; i = i + 1) {
            for (int n = 1; n <= queues.size() - 1; n = n + 1) {
                if (lengthCount.get(i) == n) {
                    queues.get(n).add(betweenPassOrder.get(i));
                }
            }
        }
        return queues;
    }
    private static int findLongestWord(ArrayList<String> betweenPassOrder) {
        int longestWord = 0;
        for (String word : betweenPassOrder) {
            if (word.length() > longestWord) {
                longestWord = word.length();
            }
        }
        return longestWord + 1;
    }
    private static ArrayList<Integer> createLengthsArray(ArrayList<String> betweenPassOrder) {
        ArrayList<Integer> lengthCount = new ArrayList<>();
        int longestWord = findLongestWord(betweenPassOrder);
        for (int i = 0; i <= betweenPassOrder.size() - 1; i = i + 1) {
            lengthCount.add(betweenPassOrder.get(i).length());
        }
        return lengthCount;
    }
}
