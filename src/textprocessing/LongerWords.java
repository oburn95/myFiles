/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class LongerWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File textFile = getTextFile();
        ArrayList<String> longerWords = analyzeText(textFile);
        printArray("The longer words ...", longerWords);
    }

    private static File getTextFile() {
        System.out.println("enter a poem or a song");
        String d = new Scanner(System.in).nextLine();
        String dr = "C:/Users/Sean/Documents/NetBeansProjects/CS2F16/";
        return new File(dr + d + ".txt");
    }

    private static ArrayList<String> analyzeText(File textFile) {
        ArrayList<String> words = new ArrayList<>(1);
        Scanner reader = getScanner(textFile);
        while (reader.hasNext()) {
            words.add(reader.next());
        }
        float averageLength = getAverageStringLength(words);
        ArrayList<String> longerWords = new ArrayList<>(1);
        for (String s : words) {
            if (s.length() > averageLength) {
                longerWords.add(s);
            }
        }
        return longerWords;
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

    private static float getAverageStringLength(ArrayList<String> list) {
        int avg = 0;
        for (String s : list) {
            avg += s.length();
        }
        return (float) avg / list.size();
    }

    private static void printArray(String pretext, ArrayList<String> strings) {
        System.out.println(pretext);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
