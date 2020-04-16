public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        String[] words = input.split(" ");
        String line = "";
        String finalText = "";
        for (String word : words) {
            if (line.length() == 0){
                line = word;
            }else{
                if ( (word.length() + line.length()) < columnNumber){
                    line += " " + word;
                }else{
                    finalText += line + "\n";
                    line = word;
                }
            }
        }
        finalText += line;
        return finalText;
    }
}