
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        String[] array = input.split(" ");
        String line = "";
        String finalString = "";
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= columnNumber) {
                if (!line.isEmpty()) {
                    finalString += line.trim() + "\n";
                    line = "";
                }
                finalString += array[i]+"\n";
            } else if ((array[i].length() + 1 + line.length()) > columnNumber) { // si laconcaténation dépassera la limite
                finalString += line + "\n";
                line = array[i];
            } else {
                line += " " + array[i];
                line = line.trim();
            }
        }
        if (line.length() != 0) {
            finalString += line;
        }
        return (finalString.endsWith("\n")) ? finalString.substring(0, finalString.length()-1) : finalString;
    }
}
