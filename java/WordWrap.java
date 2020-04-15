import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
            String cutInput = "", tempStr = "";
            long countSpace = 0;
            if(input != "") {
                List<String> words = new ArrayList<>(Arrays.asList(input.split("\\s+")));
                words.add("");
                int counter = 0;
                while (words.get(counter) != "") {
                    if(((tempStr + words.get(counter)).length() - countSpace) < columnNumber-1){
                        //System.out.println("IF : OK");
                        tempStr += words.get(counter)+' ';
                        counter ++;
                    }else{
                        //System.out.println("ELSE IF : OK");
                        cutInput += tempStr.substring(0,tempStr.length()-1) + '\n';
                        tempStr = "";
                    }
                    countSpace = tempStr.chars().filter(ch -> ch == ' ').count();
                }
                cutInput += tempStr.substring(0,tempStr.length()-1);
            }

        return cutInput;
    }
}
