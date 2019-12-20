package by.gstu.training.task2.word;

import java.util.Comparator;

/**
 * Class with common logic of comparing words by number of given characters
 * and alphabetically
 */

public class WordGivenCharComparator implements Comparator<Word> {

    private char ch;
    private WordLogic logic = new WordLogic();

    public WordGivenCharComparator(char ch) {
        this.ch = ch;
    }

    /**
     * Method returns result of comparing words by number of given characters.
     * If both words contains same number of given characters,
     * returns result of their comparing alphabetically by words String values (CharsSequence)
     *
     * @param word1 word for comparing
     * @param word2 word for comparing
     * @return integer result of comparing words
     */
    @Override
    public int compare(Word word1, Word word2) {

        int firstWordGivenCharsNumber = logic.getNumberOfGivenChars(word1, ch);
        int secondWordGivenCharsNumber = logic.getNumberOfGivenChars(word2, ch);

        int result = firstWordGivenCharsNumber - secondWordGivenCharsNumber;

        return (result != 0) ? result : word1.getCharsSequence().compareToIgnoreCase(word2.getCharsSequence());
    }
}
