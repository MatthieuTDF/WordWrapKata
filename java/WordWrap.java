
public class WordWrap {

    public static boolean isSplittable(String str, int position)
    {
        char ch1 = str.charAt(position);

        if (java.lang.Character.isWhitespace(ch1))
        {
            return true;
        }
        else {
            return false;
        }
    }


    public static String wordWrap(String input, int columnNumber) {


        String str = input;
        //str = str.replaceAll("\\r\\n|\\r|\\n| ", "\n");
        String newString = "";
        String tempString = "";
        int colMax = columnNumber-1;
        int stringLength=0;
        int actualLength=0;
        int nbChar = 0;
        String[] words = str.split(" ");

        String test = new String();

        for(int i=0; i<words.length-1;i++)
        {
            actualLength=words[i].length();

            if (actualLength >= colMax)
            {
                test += words[i];
                test += "\n";
            }
            else //if (words[i].length() + words[i+1].length() >= colMax-1)
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
                        break;
                    }
                    else
                    {
                        test += "\n";
                        stringLength=0;
                        i=j-1;
                        break;
                    }

                }

            }
        }

        test+=words[words.length-1];






        return test;

        }
}


