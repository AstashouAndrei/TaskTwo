package by.gstu.training.task2.text;

import by.gstu.training.task2.sentence.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Class with common text parsing methods description
 */

public class TextParser {

    private static final String SENTENCE_REGEX = "([^.!?]+[.!?])";

    /**
     * Method reads from given file text and returns it,
     * replacing all repeatable spaces, tabs, etc., with single space.
     *
     * @param filePath path to file with text
     * @return formatted text
     */
    public String getTextFromFile(String filePath) {

        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
            String line = br.readLine();
            while (line != null) {
                if (!line.isEmpty()) {
                    sb.append(line.replaceAll("\\s+", " "));
                    sb.append("\n");
                }
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File can't be found");
        } catch (IOException e) {
            System.out.println("File can't be read");
        }
        return sb.toString();
    }

    /**
     * Method returns ArrayList of all sentences in the text according with regex
     *
     * @param text text
     * @return ArrayList of sentences
     */
    public List<Sentence> getTextSentences(String text) {

        List<Sentence> sentences = new ArrayList<Sentence>();

        Matcher matcher = Pattern.compile(SENTENCE_REGEX).matcher(text);
        while (matcher.find()) {
            sentences.add(new Sentence(matcher.group(1).replaceAll("\\s+", " ")));
        }
        return sentences;
    }
}



