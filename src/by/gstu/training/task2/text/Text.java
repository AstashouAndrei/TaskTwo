package by.gstu.training.task2.text;

import by.gstu.training.task2.sentence.Sentence;

import java.util.List;

/**
 * Class for common description of Text
 */

public class Text {

    private String fileName;
    private String bookText;
    private List<Sentence> sentences;

    public Text(String fileName) {
        this.fileName = fileName;
        this.bookText = new TextParser().getTextFromFile(fileName);
        this.sentences = new TextParser().getTextSentences(bookText);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        this.bookText = new TextParser().getTextFromFile(fileName);
        this.sentences = new TextParser().getTextSentences(bookText);
    }

    public String getBookText() {
        return bookText;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Text text = (Text) o;
        return bookText.equals(text.bookText);
    }

    @Override
    public int hashCode() {
        final int hash = 29;
        return hash + bookText.hashCode();
    }

    @Override
    public String toString() {
        return bookText;
    }
}
