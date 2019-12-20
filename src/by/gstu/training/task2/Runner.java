package by.gstu.training.task2;

import by.gstu.training.task2.text.Text;
import by.gstu.training.task2.text.TextLogic;

/**
 * Class for running application
 */

public class Runner {

    public static void main(String[] args) {

        /*
        Creating two Text object with russian and english text (both .txt file are in resources folder)
         */
        Text russianText = new Text("src/resources/text_ru.txt");
        Text englishText = new Text("src/resources/text_eng.txt");

        TextLogic logic = new TextLogic();

        /*
        Save to different files lists of words according with task  (both .txt file will be in result folder)
         */
        logic.saveWordsWithGivenLetter(russianText, 'а', "src/result/words_ru.txt");
        logic.saveWordsWithGivenLetter(englishText, 't', "src/result/words_eng.txt");
    }
}
