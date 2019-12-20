package by.gstu.training.task2.word;

import by.gstu.training.task2.symbol.Symbol;

import java.util.List;

/**
 * Class with common description of Word
 */

public class Word {

    private String charsSequence;
    private List<Symbol> symbols;

    public Word(String charsSequence) {
        this.charsSequence = charsSequence;
        this.symbols = new WordParser().getWordChars(charsSequence);
    }

    public String getCharsSequence() {
        return charsSequence;
    }

    public void setCharsSequence(String charsSequence) {
        this.charsSequence = charsSequence;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Word word = (Word) o;
        return charsSequence.equals(word.charsSequence) &&
                symbols.equals(word.symbols);
    }

    @Override
    public int hashCode() {
        final int hash = 31;
        int result = hash + symbols.hashCode();
        return result + hash + symbols.hashCode();
    }

    @Override
    public String toString() {
        return charsSequence;
    }
}
