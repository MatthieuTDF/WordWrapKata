
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        int i = 0;
        int count;
        int taille = input.length();

        StringBuffer buffer = new StringBuffer(input);

        for (i = 0, count = 0; i < taille ; count = 0 , i++) {

            if (i < taille - columnNumber){

                if (input.charAt(i + columnNumber ) == ' ') {

                    buffer.setCharAt(i + columnNumber , '\n');
                    input = buffer.toString();
                    i = i + columnNumber;

                } else {

                    while (input.charAt(i + columnNumber - count) != ' '){
                        count++;
                    }

                    buffer.setCharAt(i + columnNumber - count, '\n');
                    input = buffer.toString();
                    i = i + columnNumber - count;

                }
            }
        }
        return input;
    }
}
