package by.gstu.training.task2.text;

import by.gstu.training.task2.sentence.SentenceParser;
import by.gstu.training.task2.word.*;
import by.gstu.training.task2.word.WordLogic;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class with description of specific Text handling methods
 */

public class TextLogic {

    private WordLogic logic = new WordLogic();

    /**
     * Method returns from given text list of words, containing given char,
     * sorted by quantity of this char in word and alphabetically.
     * Method not adds repeatable words
     *
     * @param text text
     * @param ch   character
     * @return list of words sorted alphabetically and by number of given char
     */
    public List<Word> getWordsWithGivenLetter(Text text, char ch) {

        List<Word> allWords = getTextWords(text.getBookText());

        List<Word> words = new ArrayList<Word>();

        for (int i = 0; i < allWords.size(); i++) {
            Word tempWord = new Word(allWords.get(i).getCharsSequence());
            if (logic.isWordContainChar(tempWord, ch)) {
                if (!words.contains(tempWord)) {
                    words.add(tempWord);
                }
            }
        }

        Collections.sort(words, new WordGivenCharComparator(ch));

        return words;
    }

    /**
     * Method saves to given file list of words, containing given char
     * sorted by quantity of this char in word and alphabetically.
     *
     * @param text     text
     * @param ch       character
     * @param filePath path to file where need to save list of words
     */
    public void saveWordsWithGivenLetter(Text text, char ch, String filePath) {

        List<Word> words = getWordsWithGivenLetter(text, ch);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)));

            for (Word word : words) {
                bw.write(word.getCharsSequence() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("File can't be read");
        }
    }

    /**
     * Method returns ArrayList of all words from given text
     *
     * @param text text
     * @return ArrayList of all words from given text
     */
    public List<Word> getTextWords(String text) {

        List<Word> words = new ArrayList<Word>();

        for (Word word : new SentenceParser().getSentenceWords(text)) {
            Collections.addAll(words, word);
        }
        return words;
    }
}
