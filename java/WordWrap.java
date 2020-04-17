
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        String substring;
        int temp = 0;
        StringBuilder final_input = new StringBuilder();
        boolean stringEnd = false;
        int columnNumber_temp = 0;

        String tab[] = input.split(" ");
        if (tab.length == 1){
            return input;
        }

        while(!stringEnd) {
            try {

                columnNumber_temp = columnNumber + temp;

                substring = input.substring(temp, columnNumber_temp);

                while (substring.charAt(substring.length()-1) != ' ' && substring.length() - 1 != 0) {
                    columnNumber_temp--;
                    substring = input.substring(temp, columnNumber_temp);
                }

                if (substring.length() - 1 == 0) {
                    columnNumber_temp = columnNumber + temp;
                    substring = input.substring(temp, columnNumber_temp);
                    while (substring.charAt(substring.length() - 1) != ' ') {
                        columnNumber_temp++;
                        substring = input.substring(temp, columnNumber_temp);
                    }
                }

                //System.out.println(substring.charAt(substring.length() - 1));

                temp += substring.length() ;

                final_input.append(substring).append('\n');

            } catch (Exception e) {
                stringEnd = true;
            }
        }

        return final_input.toString();
    }
}

