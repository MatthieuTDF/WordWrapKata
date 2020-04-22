
// BEAULIEU Florentin , 2ESGIA1

public class WordWrap {

    public static boolean isSplittable(String str, int position)
    {
        char char_pos = str.charAt(position);

        // On check si le caractère est un espace
        if (java.lang.Character.isWhitespace(char_pos))
        {
            return true;
        }
        else {
            return false;
        }
    }


    public static String wordWrap(String input, int columnNumber) {

        // TODO
        return input;
    }

    // On initialise nos variables
    String str_input = input;
    String newString = "";
    String tempString = "";
    int colMax = columnNumber-1;
    int stringLength=0;
    int actualLength=0;
    int nbChar = 0;

    // On split dans des tableaux lorsque l'on rencontre un caractère espace
    String[] words = str_input.split(" ");

    String test = new String();


    // Tests qui s'appliquent à nos cas rencontrés
        for(int i=0; i<words.length-1;i++)
    {
        actualLength=words[i].length();

        if (actualLength >= colMax)
        {
            test += words[i];
            test += "\n";
        }
        else
        {
            for(int j=i;j<=words.length-1;j++)
            {
                int jLength = words[j].length();

                if (stringLength+jLength < colMax)
                {
                    if (stringLength > 0)
                    {
                        test += " ";
                        stringLength+=1;
                    }
                    test +=words[j];
                    stringLength+=jLength;
                }
                else if(stringLength+jLength == colMax)
                {
                    test += " ";
                    test +=words[j];
                    test += "\n";
                    stringLength=0;
                    i=j;
                }
                else
                {
                    test += "\n";
                    stringLength=0;
                    i=j-1;
                }
            }
        }
    }
        //substring() appliqué pour le dernier index
    String lastWord = test.substring(test.lastIndexOf(" ")+1);
    test+=words[words.length-1];
        return test;
    }
}