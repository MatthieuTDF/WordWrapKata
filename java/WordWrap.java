
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        String[] tab = input.split(" ");
        String phrase = "";
        String finalphrase ="";

        if (tab.length == 1){
            return tab[0];
        }

        for(int i = 0; i < tab.length; i++){
            if(tab[i].length() >= columnNumber) {
                if(!phrase.isEmpty()){
                    finalphrase += phrase.trim() + "\n";
                    phrase = "";
                }
                finalphrase += tab[i] + "\n";
            } else if ((tab[i].length() + phrase.length() + 1) > columnNumber){
                finalphrase += phrase + "\n";
                phrase = tab[i];
            } else {
                phrase += " " + tab[i];
                phrase = phrase.trim();
            }

        }

        if (phrase.length() != 0){
             finalphrase += phrase;
        }

        if(finalphrase.endsWith("\n")) {
            finalphrase = finalphrase.substring(0, finalphrase.length()-1);

        }

        return finalphrase;
    }
}
