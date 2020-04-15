import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        String cutInput = "", tempStr = "";
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
        cutInput += tempStr.substring(0,tempStr.length()-1);
        return cutInput;
    }
}
