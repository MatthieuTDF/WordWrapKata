
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        // TODO
        String[] words = input.split("\\s+"); //mettre input dans le tableau words en enlevant les espace
        int lengthInput = words.length; // récupération du nombre de mot
        StringBuilder tmp = new StringBuilder();
        StringBuilder str = new StringBuilder();
        int i = 0;
        int value = 0;

        while (i < lengthInput) {
            if ((words[i].length() + tmp.length() - value) < columnNumber) {
                tmp.append(words[i]);
                i++;
            }
            if (tmp.length() < columnNumber) {
                tmp.append(' ');
                value++;
            } else {
                tmp.append('\n');
                str.append(tmp);
                tmp.setLength(0);
                value = 0;
            }
        }
        tmp.append('\n');
        str.append(tmp);

        input = str.toString();

        return input;
    }
}
