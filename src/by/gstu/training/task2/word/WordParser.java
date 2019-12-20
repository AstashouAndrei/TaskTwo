package by.gstu.training.task2.word;

import by.gstu.training.task2.symbol.Symbol;

import java.util.ArrayList;
import java.util.List;

/**
 * Class with common word parsing methods description
 */
public class WordParser {

    /**
     * Method returns ArrayList of all chars in word
     *
     * @param word word char sequence
     * @return ArrayList of chars in word
     */
    public List<Symbol> getWordChars(String word) {

        List<Symbol> symbols = new ArrayList<Symbol>();

        char[] chars = word.toCharArray();

        for (char ch : chars) {
            symbols.add(new Symbol(ch));
        }
        return symbols;
    }
}
