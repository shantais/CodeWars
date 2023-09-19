package kyu6;

import org.junit.Ignore;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderTest {

    @Test
    @Ignore
    public void CheckIfMessageIsInList(){
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("[...., ., -.--, .---, ..-, -.., .]"));
    }

    @Test
    @Ignore
    public void DecodeFirstLetterFromMessage(){
        assertThat(MorseCodeDecoder.decode("...."), is("H"));
    }

    @Test
    public void CheckMorseCode(){
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}