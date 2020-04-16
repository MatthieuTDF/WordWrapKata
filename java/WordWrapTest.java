import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordWrapTest {

    @Test
    public void oneLongLine() {
        String inputString = "012345678901234567890123456789";

        String expectedtring = "012345678901234567890123456789";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void simpleBreakAtLimit() {
        String inputString = "01234567890123456789 0123456789";

        String expectedtring = "01234567890123456789\n0123456789";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void simpleBreakAtLimit2() {
        String inputString = "012345678901234567890123 0123456789";

        String expectedtring = "012345678901234567890123\n0123456789";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }


    @Test
    public void simpleBreakBeforeLimit() {
        String inputString = "01234567890 1234567890123456789";

        String expectedtring = "01234567890\n1234567890123456789";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void twoBreaks() {
        String inputString = "01234567890 12345678901234567890123 1234567890";

        String expectedtring = "01234567890\n12345678901234567890123\n1234567890";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void twoBreaksComplex() {
        String inputString = "01234567890 12345678 901234567890 123456789001245689156";

        String expectedtring = "01234567890 12345678\n901234567890\n123456789001245689156";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void twoBreaksWithLongWord() {
        String inputString = "0123456789012345 1234567890123456789012345 1234567890";

        String expectedtring = "0123456789012345\n1234567890123456789012345\n1234567890";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void smallLorem() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod";

        String expectedString =
                "Lorem\nipsum\ndolor sit\namet,\nconsectetur\nadipiscing\nelit, sed\ndo eiusmod";


        assertEquals(expectedString, WordWrap.wordWrap(inputString, 10));
    }

    @Test
    public void lorem40Max() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String expectedString =
                        "Lorem ipsum dolor sit amet, consectetur\n" +
                        "adipiscing elit, sed do eiusmod tempor\n" +
                        "incididunt ut labore et dolore magna\n" +
                        "aliqua. Ut enim ad minim veniam, quis\n" +
                        "nostrud exercitation ullamco laboris\n" +
                        "nisi ut aliquip ex ea commodo consequat.\n" +
                        "Duis aute irure dolor in reprehenderit\n" +
                        "in voluptate velit esse cillum dolore eu\n" +
                        "fugiat nulla pariatur. Excepteur sint\n" +
                        "occaecat cupidatat non proident, sunt in\n" +
                        "culpa qui officia deserunt mollit anim\n" +
                        "id est laborum.";

        assertEquals(expectedString, WordWrap.wordWrap(inputString, 40));
    }


    @Test
    public void lorem20Max() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String expectedString =
                        "Lorem ipsum dolor\n" +
                        "sit amet,\n" +
                        "consectetur\n" +
                        "adipiscing elit, sed\n" +
                        "do eiusmod tempor\n" +
                        "incididunt ut labore\n" +
                        "et dolore magna\n" +
                        "aliqua. Ut enim ad\n" +
                        "minim veniam, quis\n" +
                        "nostrud exercitation\n" +
                        "ullamco laboris nisi\n" +
                        "ut aliquip ex ea\n" +
                        "commodo consequat.\n" +
                        "Duis aute irure\n" +
                        "dolor in\n" +
                        "reprehenderit in\n" +
                        "voluptate velit esse\n" +
                        "cillum dolore eu\n" +
                        "fugiat nulla\n" +
                        "pariatur. Excepteur\n" +
                        "sint occaecat\n" +
                        "cupidatat non\n" +
                        "proident, sunt in\n" +
                        "culpa qui officia\n" +
                        "deserunt mollit anim\n" +
                        "id est laborum.";

        assertEquals(expectedString, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void lorem10Max() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String expectedString =
                        "Lorem\n" +
                        "ipsum\n" +
                        "dolor sit\n" +
                        "amet,\n" +
                        "consectetur\n" +
                        "adipiscing\n" +
                        "elit, sed\n" +
                        "do eiusmod\n" +
                        "tempor\n" +
                        "incididunt\n" +
                        "ut labore\n" +
                        "et dolore\n" +
                        "magna\n" +
                        "aliqua. Ut\n" +
                        "enim ad\n" +
                        "minim\n" +
                        "veniam,\n" +
                        "quis\n" +
                        "nostrud\n" +
                        "exercitation\n" +
                        "ullamco\n" +
                        "laboris\n" +
                        "nisi ut\n" +
                        "aliquip ex\n" +
                        "ea commodo\n" +
                        "consequat.\n" +
                        "Duis aute\n" +
                        "irure\n" +
                        "dolor in\n" +
                        "reprehenderit\n" +
                        "in\n" +
                        "voluptate\n" +
                        "velit esse\n" +
                        "cillum\n" +
                        "dolore eu\n" +
                        "fugiat\n" +
                        "nulla\n" +
                        "pariatur.\n" +
                        "Excepteur\n" +
                        "sint\n" +
                        "occaecat\n" +
                        "cupidatat\n" +
                        "non\n" +
                        "proident,\n" +
                        "sunt in\n" +
                        "culpa qui\n" +
                        "officia\n" +
                        "deserunt\n" +
                        "mollit\n" +
                        "anim id\n" +
                        "est\n" +
                        "laborum.";

        assertEquals(expectedString, WordWrap.wordWrap(inputString, 10));
    }
}
