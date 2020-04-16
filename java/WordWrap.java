
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
                if (tmp.length() < columnNumber && words[i].length() < columnNumber) {
                    tmp.append(' ');
                } else {
                    tmp.append('\n');
                    str.append(tmp);
                    tmp.setLength(0);
                }
            }
        }
        //tmp.append('\n');
        str.append(tmp);

        input = str.toString();

        return input;
    }

    /*public static String wordWrapPeter(String input, int columnNumber) {

        String cutInput = "", tempStr = "";
        long countSpace = 0;
        List<String> words = new ArrayList<>(Arrays.asList(input.split("\\s+")));
        words.add("");
        int counter = 0;
        while (words.get(counter) != "") {
            if((tempStr + words.get(counter)).length() <= columnNumber || words.get(counter).length() >= columnNumber){
                if((tempStr + words.get(counter)).length() > words.get(counter).length() && (tempStr + words.get(counter)).length() > columnNumber){
                    cutInput += tempStr.substring(0,tempStr.length()-1) + '\n';
                    tempStr = "";
                }else{
                    tempStr += words.get(counter)+' ';
                    counter ++;
                }
            }else{
                cutInput += tempStr.substring(0,tempStr.length()-1) + '\n';
                tempStr = "";
            }
        }
        cutInput = (tempStr.length() > 1) ? cutInput += tempStr.substring(0,tempStr.length()-1) :  cutInput;
        return cutInput;
    }*/
}
