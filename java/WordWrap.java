
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        // TODO
        int size;
        String[] tab;
        String transformed;
        int i = 0;
        int j;
        int curs;

        if (columnNumber == 0){
            return "error column is NULL";
        }
        if (input.length()<columnNumber){
            return input;
        }

        if((input.length()%columnNumber)==0){
            size = input.length()/columnNumber;
        }else{
            size = input.length()/columnNumber+1;
        }

        tab = new String[size];


        for (j=0; j<size-1; j++){
            curs = i;
            i= i + columnNumber;
            while(input.charAt(i) != ' ' && input.charAt(i) != '.' && input.charAt(i) != ','){ /// Caractères tolérés pour séparer
                if(i == 0){
                    return input;
                }
                i--;
            }
            tab[j] = input.substring(curs, i);
        }


        transformed = String.join("\n", tab);
        return transformed;
    }
}
