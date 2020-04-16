public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        int numberChar = 0;
        int numberWords = 0;
        StringBuilder newString = new StringBuilder();
        String[] fullWords = input.split(" ");
        for(String word:fullWords){
            numberChar += word.length();
            numberWords++;
            if(numberWords > 1)
                numberChar++;
            if(numberChar <= columnNumber || (word.length() >= columnNumber && numberWords == 1)){
                if(newString.length() == 0) {
                    newString.append(word);
                }
                else
                    newString.append(" ").append(word);
            }else{
                newString.append("\n").append(word);
                numberChar = word.length();
                numberWords = 1;
            }
        }
        return newString.toString();
    }
}
