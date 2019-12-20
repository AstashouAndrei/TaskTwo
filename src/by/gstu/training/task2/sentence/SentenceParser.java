package by.gstu.training.task2.sentence;

import by.gstu.training.task2.punctuaion.Punctuation;
import by.gstu.training.task2.word.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class with common sentence parsing methods description
 */

public class SentenceParser {

    private static final String WORD_REGEX = "[^A-Za-zА-Яа-яЁё]+";
    private static final String PUNCTUATION_REGEX = "\\p{Punct}";

    /**
     * Method returns ArrayList of all words in sentence according with regex
     *
     * @param sentence sentence text
     * @return ArrayList of words in sentence
     */
    public List<Word> getSentenceWords(String sentence) {

        List<Word> words = new ArrayList<Word>();

        String[] wordArray = sentence.split(WORD_REGEX);

        for (String text : wordArray) {
            words.add(new Word(text));
        }
        return words;
    }

    /**
     * Method returns ArrayList of all punctuations mark in sentence according with regex
     *
     * @param sentence sentence text
     * @return ArrayList of punctuations mark in sentence
     */
    public List<Punctuation> getSentencePunctuations(String sentence) {

        List<Punctuation> punctuations = new ArrayList<Punctuation>();

        Matcher matcher = Pattern.compile(PUNCTUATION_REGEX).matcher(sentence);

        while (matcher.find()) {
            punctuations.add(new Punctuation(matcher.group().charAt(0)));
        }
        return punctuations;
    }
}
