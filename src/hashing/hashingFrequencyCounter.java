/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Sean
 */
public class hashingFrequencyCounter {

    private static final HashMap<String, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
        FrequencyCounts();
        dump();
        interpreter();
    }

    private static void FrequencyCounts() {
        for (String word : getWords()) {
            if (MAP.containsKey(word)) {
                MAP.put(word, MAP.get(word) + 1);
            } else {
                MAP.put(word, 1);
            }
        }
    }

    private static ArrayList<String> getWords() {
        ArrayList<String> words = new ArrayList<>(1);
        Scanner reader = getScanner(
                new File("C:/Users/Sean/Documents/NetBeansProjects/CS2F16/songBST.txt"));
        while (reader.hasNext()) {
            words.add(reader.next().toLowerCase());
        }
        return words;
    }

    private static Scanner getScanner(File wordFile) {
        try {
            return new Scanner(wordFile);
        } catch (FileNotFoundException ex) {
            System.err.println("File does not exist");
            System.exit(1);
            return null;
        }
    }

    private static void dump() {
        System.out.println("run-single:");
         for(String word : MAP.keySet())
             System.out.println("<" + word + ":" + MAP.get(word).byteValue() + ">");
     }
 

    

    private static void interpreter() {
        while (true) {
            Scanner kb = new Scanner(System.in);
            System.out.print(">>> ");
            String userInput = kb.next();
            if (userInput.equalsIgnoreCase("COUNT")) {
                System.out.println("Word? ");
                System.out.println(MAP.get(kb.next()).byteValue());
            } else if (userInput.equalsIgnoreCase("PRINT")) {
                TreeSet<String> Tree = new TreeSet<>();
                for (String word : MAP.keySet()) {
                    Tree.add(word);
                }
                for (String word : Tree) {
                    System.out.println("<" + word + ":" + MAP.get(word).byteValue() + ">");
                }
            } else if (userInput.equalsIgnoreCase("EXIT")) {
                break;
            }
        }
    }

}





