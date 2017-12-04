import org.junit.Test;

import sparkexample.WordCount;

import java.net.URISyntaxException;

public class WordCountTest {

    @Test
    public void test() throws URISyntaxException {
        java.net.URL url =  getClass().getResource("input.txt");
        String inputFile = getClass().getResource("input.txt").toURI().toString();
        new WordCount().run(inputFile);
    }
}