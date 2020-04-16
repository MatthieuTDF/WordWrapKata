import java.util.Arrays;

public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        //PROGRAMME FAIT AVEC HUGO MATHIEU



        int length = input.length();
        int maxCharPerRow = columnNumber;
        String words[] = input.split(" ");
        String Letters[] = input.split("");
        System.out.println("\ninput :" + input);
        System.out.println("Nombre de caractères : " + length);
        System.out.println("nombre max de caractères autorisés:" + maxCharPerRow);
        System.out.println("nombre de mots :" + words.length + "\n");





        String finalString=""  ;


        for(int i = 0; i <=words.length-1 ; i++){
            String row  ="" ;

            row += words[i] ;
            /*
            'tailleMotX'+'tailleMotX+1' > 10 ?
              osef
            'tailleMotX'+'tailleMotX+1' < 10 ?
              'tailleMotX'+'tailleMotX+1'+'tailleMotX+2' > 10 ?
                //on remplace l'espace entre les 2 mots par un \n
              'tailleMotX'+'tailleMotX+1'+'tailleMotX+2' < 10 ?
                  'tailleMotX'+'tailleMotX+1'+'tailleMotX+2'+'tailleMotX+23 > 10 ?
                  //on remplace l'espace entre les 3 mots par un \n
             */

            if((words[i].length() + row.length()< maxCharPerRow)){
                row +=" " ;
            }
            if((words[i].length() + row.length()>=maxCharPerRow && i !=words.length-1)){
                row +="\n" ;
            }
            finalString +=row ;
        }

        return finalString;





    /*
        String finalStringYohann="";
        int error = 0;
        String Letters[] = input.split("");

        //TEST oneLongLine
        for (int i=0;i<columnNumber;i++){
            if (Letters[i]=="\n") {
                error = 1;
            }
        }
        for (int i=0;i<30;i++){
            if (Letters[i]=="\n") {
                error = 1;
            }
        }
        if (error==0){
            return input;
        }
        String simpleBreakAtLimit = Arrays.asList(Letters).toString();
        System.out.println(simpleBreakAtLimit);

        return finalStringYohann;


     */
    }
}
