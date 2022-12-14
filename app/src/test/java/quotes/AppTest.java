/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;
import static quotes.App.randomQuote;

class AppTest {
    String filePath = System.getProperty("user.dir");
    Reader testReader = Files.newBufferedReader(Paths.get(filePath + "\\src" +
            "\\main" +
            "\\resources\\recentquotes.json"));
    AppTest() throws IOException {
    }
    @Test void randomQuoteText() throws IOException {
        assert(App.randomQuote(filePath).contains("Author:"));
    }


}
