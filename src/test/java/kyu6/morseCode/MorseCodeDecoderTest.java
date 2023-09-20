package kyu6.morseCode;

import kyu6.morseCode.MorseCodeDecoder;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderTest {

    @Test
    public void DecodeLetterFromMorseCode(){
        assertThat(MorseCode.get("...."), is("H"));
    }

    @Test
    public void CheckMorseCode(){
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}