
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        // TODO
        String[] words = input.split("\\s+"); //mettre input dans le tableau words en enlevant les espace
        int lengthInput = words.length; // récupération du nombre de mot
        StringBuilder tmp = new StringBuilder();
        StringBuilder str = new StringBuilder();
        int i = 0;

        while (i < lengthInput) {
            if ((words[i].length() + tmp.length()) <= columnNumber || words[i].length() > columnNumber) {
                tmp.append(words[i]);
                i++;
            }
            if (i < lengthInput) {
                if (tmp.length() < columnNumber && words[i].length()+1 < columnNumber && (words[i].length() + tmp.length()) < columnNumber) {
                    tmp.append(' ');
                } else {
                    tmp.append('\n');
                    str.append(tmp);
                    tmp.setLength(0);
                }
            }
        }
        str.append(tmp);

        input = str.toString();

        return input;
    }
}
