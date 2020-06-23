package GLOSSARY;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
/*
* Classname : Main
*
* Created on 23 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
*  1.1. Download a text about Harry Potter.

    1.2. For each distinct word in the text calculate the number of occurrence.

    1.3. Use RegEx..

    1.4. Sort in the DESC mode by the number of occurrence..

    1.5. Find  the first 20 pairs.

    1.6  Find all the proper names

    1.7.  Count them and arrange in alphabetic order.

    1.8.   First 20 pairs and names write into to a file test.txt

    1.9.  Create a fine header for the file

    1.10  Use Java  Collections to demonstrate your experience (Map, List )
*/

public class Main {

    public static void main(String[] args) throws IOException {

        //  1.1. Download a text about Harry Potter.
        String text = new String(Files
                .readAllBytes(Paths.get("harry.txt")));

        //1.3. Use RegEx..
        String cleanedText = text.replaceAll("[\\P{L}]+", " ");

        String[] words = cleanedText.split(" ");

        // 1.2 For each distinct word in the text
        // calculate the number of occurrence.

        // Array containing distinct words
        String distinctWords = "";
        for (int i = 0; i < words.length; i++) {

            if (!distinctWords.contains(words[i])) {
                distinctWords += words[i];
            }
        }

        String[] distinct = distinctWords.split(" ");

        // calculate the number of occurrence
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : distinct) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }

        // 1.4. Sort in the DESC mode by the number of occurrence.
        List wordsByKey = new ArrayList(wordToCount.keySet());
        Collections.sort(wordsByKey);

        for (int i = 0; i < wordsByKey.size(); i++) {
            System.out.println(wordsByKey.get(i));
        }

        //1.5. Find  the first 20 pairs.
        for (int i = 0; i < 20; i++) {
            System.out.println(wordsByKey.get(i));
        }
    }
}
