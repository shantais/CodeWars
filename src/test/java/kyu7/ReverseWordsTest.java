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
                () -> assertEquals("elbuod  decaps     sdrow", ReverseWords.reverseWords("double  spaced     words"))
        );

    }
    @Test
    public void onlySpacesReverseTest() {
        assertEquals("   ", ReverseWords.reverseWords("   "));
    }
    @Test
    public void onlySpacesReverseTest2() {
        assertAll(
                () -> assertEquals("elppa", ReverseWords.reverseWords2("apple")),
                () -> assertEquals("a b c d", ReverseWords.reverseWords2("a b c d")),
                () -> assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords2("The quick brown fox jumps over the lazy dog.")),
                () -> assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords2("double  spaced  words")),
                () -> assertEquals("elbuod   decaps   sdrow", ReverseWords.reverseWords2("double   spaced   words")),
                () -> assertEquals("elbuod  decaps     sdrow", ReverseWords.reverseWords2("double  spaced     words"))
        );
    }
}