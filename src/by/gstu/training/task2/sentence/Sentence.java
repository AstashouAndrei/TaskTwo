package by.gstu.training.task2.sentence;

import by.gstu.training.task2.punctuaion.Punctuation;
import by.gstu.training.task2.word.Word;

import java.util.List;

/**
 * Class with common description of Sentence
 */

public class Sentence {

    private String sentenceText;
    private List<Word> words;
    private List<Punctuation> punctuations;

    public Sentence(String sentenceText) {
        this.sentenceText = sentenceText;
        this.words = new SentenceParser().getSentenceWords(sentenceText);
        this.punctuations = new SentenceParser().getSentencePunctuations(sentenceText);
    }

    public String getSentenceText() {
        return sentenceText;
    }

    public void setSentenceText(String sentenceText) {
        this.sentenceText = sentenceText;
    }

    public List<Word> getWords() {
        return words;
    }

    public List<Punctuation> getPunctuations() {
        return punctuations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sentence sentence = (Sentence) o;
        return sentenceText.equals(sentence.getSentenceText());
    }

    @Override
    public int hashCode() {
        final int hash = 31;
        return hash + sentenceText.hashCode();
    }

    @Override
    public String toString() {
        return sentenceText;
    }
}
