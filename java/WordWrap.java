
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        // TODO

        //first try, full fail -_-, je ne sais pas pourquoi
        //put input in an array so we can modify and search a specified character
        char[] stringArray = input.toCharArray();

        int length = input.length();
        int i;
        int position;

        //go through the input until the last jump
        for (i = 0, position = 0; i < length; position = 0) {

            ///in order to avoid out of range
            if (i + columnNumber > length - columnNumber) {

                break;

            }
            System.out.println(stringArray);
            ///check if the last character to be displayed is a space
            if (stringArray[i + columnNumber] == ' ') {

                ///if it's a space, then we can change it to a \n
                stringArray[i + columnNumber] = '\n';

                ///jump to the next line
                i = i + columnNumber;

            } else {

                ///if it's a char then we don't want to cut a word so we go back and increment as long as it's a letter
                while (stringArray[i + columnNumber + position] != ' ') {

                    position++;
                }

                ///go to the nearest space and make it a \n
                stringArray[i + columnNumber + position] = '\n';
                i = i + columnNumber + position;

            }
        }

        input = stringArray.toString();
        return input;
    }
}
