package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {
    @Test
    public void singleWordReverseTest(){
        assertEquals("elppa", ReverseWords.reverseWords("apple"));
    }
    @Test
    public void multipleWordReverseTest(){
        assertAll(
                () -> assertEquals("a b c d", ReverseWords.reverseWords("a b c d")),
                () -> assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."))
        );
    }
    @Test
    public void multipleSpacesReverseTest() {
        assertAll(
                () -> assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words")),
                () -> assertEquals("elbuod   decaps   sdrow", ReverseWords.reverseWords("double   spaced   words")),
                () -> assertEquals("elbuod  decaps    sdrow", ReverseWords.reverseWords("double  spaced     words"))
        );

    }
}