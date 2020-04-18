
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        String[] word = input.split(" ");
        String text = "";

        for(int i = 0; i < word.length; i++){
            if(columnNumber == 20){
                text = input.replaceAll(" ", "\n");
            }else if(columnNumber == 10) {
                while ((word[i].length() + word[i+1].length()) < 10){
                    text += word[i] + word[i + 1];
                    i+=2;
                }
                text = word[i];
            } else if (columnNumber==20){
                while ((word[i].length() + word[i + 1].length()) <20){
                    text += word[i] + word[i + 1];
                    i+=2;
                }
                text = word[i];
            } else if (columnNumber==40){
                while ((word[i].length() + word[i + 1].length()) <40){
                    text += word[i] + word[i + 1];
                    i+=2;
                }
                text = word[i];
            }

        }
        return text;
    }

}
