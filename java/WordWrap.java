
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        //int strLength = ;

        char[] charInput = input.toCharArray();
        String[] words = new String[input.length()];
        String word = "";
        int j = 0;
        for(int i = 0;i < charInput.length;i++)
        {
            if(!Character.isWhitespace(charInput[i]))
            {
                word += charInput[i];
                if(i == charInput.length-1)
                {
                    words[j] = word;
                    //System.out.println(word);
                    j++;
                    word = "";
                }
            }
            else
            {
                words[j] = word;
                //System.out.println(word);
                j++;
                word = "";
            }
        }
        String line = "";
        input = "";
        for(int i = 0;i < words.length ;i++)
        {
            try
            {
                //System.out.println(words[i]);

                int strLength = line.length() + words[i].length();
                if (strLength < columnNumber) {
                    line += words[i] + " ";
                }
                else
                {
                    //System.out.println(line);
                    input += line + "\n";
                    i--;
                    line = "";
                }
            }
            catch (NullPointerException e)
            {
                //System.out.println(line);
                input += line;
                break;
            }
        }
        return input;
    }
}
