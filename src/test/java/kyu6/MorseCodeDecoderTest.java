package kyu6;

import org.junit.Ignore;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderTest {

    @Test
    public void CheckIfMessageIsInList(){
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("[...., ., -.--, , , .---, ..-, -.., .]"));
    }

    @Test
    public void GetLineFromMorseCodeTxt(){
        Path path = Paths.get("src", "main", "java", "kyu6", "MorseCode.txt");
        assertThat(MorseCodeDecoder.getLine(path), is("A|.-"));
    }

    @Test
    public void CheckMorseCode(){
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}