
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
            // insert \n @ columnNumber OR @ the last space
            int cursor = columnNumber;
            int lastCursor = 0;
            char[] arrayedInput = input.toCharArray();
            while ((cursor < input.length()-1) && (cursor > 0)) {
                while ((arrayedInput[cursor] != ' ') && (cursor > 0) && (cursor > lastCursor)) {
                    cursor--;
                }
                if (cursor == lastCursor) {
                    cursor += columnNumber+2;
                    while (cursor < input.length()-1 && arrayedInput[cursor] != ' ') {
                        cursor++;
                    }
                }
                if (cursor > 0 && cursor != input.length()-1) {
                    arrayedInput[cursor] = '\n';
                    lastCursor = cursor;
                    cursor += columnNumber+1;
                }
            }
        return String.valueOf(arrayedInput);
    }
}
