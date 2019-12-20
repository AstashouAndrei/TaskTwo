package by.gstu.training.task2.word;

import by.gstu.training.task2.symbol.Symbol;

/**
 * Class with specific Word methods description
 */
public class WordLogic {

    /**
     * Method calculate number of given char(s) in the word
     *
     * @param word word
     * @param ch   given char
     * @return numbers of given char(s) in the word
     */
    public int getNumberOfGivenChars(Word word, char ch) {
        int number = 0;
        char[] array = word.getCharsSequence().toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                number++;
            }
        }
        return number;
    }

    /**
     * Method determines is word contains given character
     *
     * @param word word
     * @param ch   char
     * @return boolean result does the word contain the given character
     */
    public boolean isWordContainChar(Word word, char ch) {
        return word.getSymbols().contains(new Symbol(ch));
    }
}
