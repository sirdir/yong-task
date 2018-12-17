package space.sirdir;

import org.junit.Assert;
import org.junit.Test;

public class WorkWithStringTest {

    WorkWithString wws = new WorkWithString();

    @Test
    public void emptyString() {
        String empty = "";
        String actual = wws.countCharsInARow(empty);
        Assert.assertEquals("", actual);
    }

    @Test(expected = NullPointerException.class)
    public void nullString() {
        String nullStr = null;
        wws.countCharsInARow(nullStr);
    }

    @Test
    public void singleLetter() {
        String single = "a";
        String actual = wws.countCharsInARow(single);
        Assert.assertEquals("1a", actual);
    }

    @Test
    public void singleLetterRow() {
        String row = "aaaaaaa";
        String actual = wws.countCharsInARow(row);
        Assert.assertEquals("7a", actual);
    }

    @Test
    public void differentLetters() {
        String row = "abbaacccttaaeedd";
        String actual = wws.countCharsInARow(row);
        Assert.assertEquals("1a2b2a3c2t2a2e2d", actual);
    }

    @Test
    public void cyrillicAndLatin_A_and_C() {
        String row = "aaaаааcccссс";
        String actual = wws.countCharsInARow(row);
        Assert.assertEquals("3a3а3c3с", actual);
    }

    @Test
    public void spaces() {
        String containsSpaces = "aaa a a    a  ";
        String actual = wws.countCharsInARow(containsSpaces);
        Assert.assertEquals("3a1 1a1 1a4 1a2 ", actual);
    }

    @Test
    public void digits() {
        String containsSpaces = "9991222222";
        String actual = wws.countCharsInARow(containsSpaces);
        Assert.assertEquals("391162", actual);
    }

    @Test
    public void escapedSymbols() {
        String containsSpaces = "aa\n\n\n\n\"\"\t\t\t\n";
        String actual = wws.countCharsInARow(containsSpaces);
        Assert.assertEquals("2a4\n2\"3\t1\n", actual);
    }

}
