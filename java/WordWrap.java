
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        StringBuilder builder = new StringBuilder(input);
        int pos;

        for(int i = columnNumber;i<input.length();i+= columnNumber+1){
            pos = i;
                while(builder.charAt(i) != ' '){
                  if(builder.charAt(i) != '\n' && i>=1)
                      i--;
                  else {
                      while(pos < builder.length() && builder.charAt(pos) != ' ' )
                          pos++;

                      if(pos == builder.length())
                          return builder.toString();

                      i = pos;
                      break;
                  }
                }
            builder.setCharAt(i,'\n');
        }
        return builder.toString();
    }

}
