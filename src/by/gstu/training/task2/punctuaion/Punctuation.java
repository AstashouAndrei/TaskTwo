package by.gstu.training.task2.punctuaion;

/**
 * Class with common description of Punctuation marks
 */

public class Punctuation {

    private char punctuationMark;

    public Punctuation(char punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    public char getPunctuationMark() {
        return punctuationMark;
    }

    public void setPunctuationMark(char punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Punctuation that = (Punctuation) o;
        return punctuationMark == that.punctuationMark;
    }

    @Override
    public int hashCode() {
        final int hash = 47;
        return hash + super.hashCode();
    }

    @Override
    public String toString() {
        return String.valueOf(punctuationMark);
    }
}
