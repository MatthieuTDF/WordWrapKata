import java.util.Arrays;

public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        // TODO

        //put input in an array so we can modify and search a specified character
        char[] stringArray = input.toCharArray();

        int length = input.length();
        int i;
        int position;
        char space = ' ';

        //go through the input until the last jump
        for (i = 0, position = 0; i <= length; i+=columnNumber,position = 0) {

            ///in order to avoid out of range
           if (i + columnNumber >= length) {

                break;

            }

            ///check if the last character to be displayed is a space
            if (stringArray[i + columnNumber -1] == ' ') {

                ///if it's a space, then we can change it to a \n
                stringArray[i + columnNumber -1] = '\n';

                ///jump to the next line
                //i = i + columnNumber;

                ///case of a word not finished at columnNumber
            } else if (stringArray[i + columnNumber] == ' '){

                ///case of a word that ends at columnNumber
                stringArray[i + columnNumber] = '\n';
                //i = i + columnNumber;

            }else if((input.substring(0, i + columnNumber)).indexOf((space)) != -1){

                ///As long as the word isn't finished, we want to look for the previous space
                while(stringArray[i + columnNumber + position] != ' ') {

                    position--;

                }
                stringArray[i + columnNumber + position] = '\n';
                //i = i + columnNumber + position;

                ///looking for the next space if there is one
            }else if((input.substring(i + columnNumber, length)).indexOf((space)) != -1){

                while(stringArray[i + columnNumber + position] != ' ') {

                    position++;

                }
                stringArray[i + columnNumber + position] = '\n';
                //i = i + columnNumber + position;

                ///no more space => print as it is
            }else break;

            input = new String(stringArray);
        }

        //input = new String(stringArray);
       // input = Arrays.toString(stringArray);
        //input = stringArray.toString();
        return input;
    }
}
