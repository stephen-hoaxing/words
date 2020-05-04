package words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFunctionsTest {

    StringFunctions stringFunctions = new StringFunctions();

    @Test
    public void getLongestWordWhenEmptyString() {
        Word longestWord = stringFunctions.getLongestWord("");
        assertEquals("", longestWord.getWord());
        assertEquals(0, longestWord.getLength());
    }

    @Test
    public void getLongestWordWhenNullString() {
        Word longestWord = stringFunctions.getLongestWord(null);
        assertEquals("", longestWord.getWord());
        assertEquals(0, longestWord.getLength());
    }

    @Test
    public void getLongestWordWhenPlainString() {
        Word longestWord = stringFunctions.getLongestWord("abcd efg hijklmnopqrst uvw xyz");
        assertEquals("hijklmnopqrst", longestWord.getWord());
        assertEquals(13, longestWord.getLength());
    }

    @Test
    public void getLongestWordWhenStringContainsPunctuation() {
        Word longestWord = stringFunctions.getLongestWord("abcd, efg; hijklmnopqrst. - uvw: xyz? ");
        assertEquals("hijklmnopqrst", longestWord.getWord());
        assertEquals(13, longestWord.getLength());
    }

    @Test
    public void getLongestWordWhenStringContainsPunctuationAndDashes() {
        Word longestWord = stringFunctions.getLongestWord("abcd, efg; hijklmnopqrst----. - uvw: xyz-- ");
        assertEquals("hijklmnopqrst----", longestWord.getWord());
        assertEquals(17, longestWord.getLength());
    }

    @Test
    public void getLongestWordWhenStringContainsPunctuationAndDashesAndUpperCaseLetters() {
        Word longestWord = stringFunctions.getLongestWord("abcd, efg; hijklmNoPqrst----. - uvw: xyz-- ");
        assertEquals("hijklmNoPqrst----", longestWord.getWord());
        assertEquals(17, longestWord.getLength());
    }

    @Test
    public void getShortestWordWhenEmptyString() {
        Word shortestWord = stringFunctions.getShortestWord("");
        assertEquals("", shortestWord.getWord());
        assertEquals(0, shortestWord.getLength());
    }

    @Test
    public void getShortestWordWhenNullString() {
        Word shortestWord = stringFunctions.getShortestWord(null);
        assertEquals("", shortestWord.getWord());
        assertEquals(0, shortestWord.getLength());
    }

    @Test
    public void getShortestWordWhenPlainString() {
        Word shortestWord = stringFunctions.getShortestWord("abcd efg hijklmnopqrst uvw xy");
        assertEquals("xy", shortestWord.getWord());
        assertEquals(2, shortestWord.getLength());
    }

    @Test
    public void getShortestWordWhenStringContainsPunctuation() {
        Word shortestWord = stringFunctions.getShortestWord("abcd, e!; hijklmnopqrst. - uvw: xyz ");
        assertEquals("e", shortestWord.getWord());
        assertEquals(1, shortestWord.getLength());
    }

    @Test
    public void getShortestWordWhenStringContainsPunctuationAndDashes() {
        Word shortestWord = stringFunctions.getShortestWord("abcd, efg; hijklmnopqrst----. - u-: xyz-- ");
        assertEquals("u-", shortestWord.getWord());
        assertEquals(2, shortestWord.getLength());
    }

    @Test
    public void getShortestWordWhenStringContainsPunctuationAndDashesAndUpperCaseLetters() {
        Word shortestWord = stringFunctions.getShortestWord("abcd, E--; hijklmNoPqrst----. - uvw: xyz-- ");
        assertEquals("E--", shortestWord.getWord());
        assertEquals(3, shortestWord.getLength());
    }
}