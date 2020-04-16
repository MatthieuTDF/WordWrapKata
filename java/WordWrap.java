
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
            // insert \n @ columnNumber OR @ the last space
            int cursor = columnNumber;
            int lastCursor = 0;
            char[] arrayedInput = input.toCharArray();              // convert inputed string to CharArray for easier char insertion
            while ((cursor < input.length()-1) && (cursor > 0)) {   // global loop : we shall leave the loop only once the whole process is completed, id est once we either reach the end of the string, or get stuck at its beginning.
                while ((arrayedInput[cursor] != ' ') && (cursor > 0) && (cursor > lastCursor)) {    // regular case loop, this loop will set cursor to the index of the previous space
                    cursor--; // while cursor DOES NOT point to a space AND is greater than both lastCursor (avoid going back from 0 each time) and 0 (avoid out of range index), decrement cursor
                }
                if (cursor == lastCursor) {     // if cursor equals lastCursor, then we face a word larger than columnNumber, so we need to check further
                    cursor += columnNumber+2;   // we increment cursor to the next unchecked char, furthest checked char is the char at lastCursor + columnNumber +1
                    while (cursor < input.length()-1 && arrayedInput[cursor] != ' ') {  // too-large case loop, this loop will set cursor to the index of the next space
                        cursor++;               // while cursor DOES NOT point to a space AND doesnt point the end of the string, increment cursor 
                    }
                }
                if (cursor > 0 && cursor != input.length()-1) { // if cursor points to a valid char in the string (0 < cursor < input.length()-1)
                    arrayedInput[cursor] = '\n';                // replaces cursor-th char (which is a space) by '\n'
                    lastCursor = cursor;                        // set lastCursor to current cursor
                    cursor += columnNumber+1;                   // increment cursor by the inputed value + 1, to make up for the char we currently point at
                }
            }
        return String.valueOf(arrayedInput);                    // convert our char-array to a string and return it
    }
}
