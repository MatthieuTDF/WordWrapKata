
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        //On met les mots de l'input dans un tableau
        String words[] = input.split(" ");

        StringBuilder textRow = new StringBuilder();

        //Compteur de caractères qu'on veut insérer dans une ligne
        int nbChar = 0;
        //Compteur de mots
        int nbWords = 0;

        for(String word:words){
            //On ajoute la longueur du mots au compteur de caractères
            nbChar += word.length();
            //On ajoute 1 au compteur de mots
            nbWords++;

            // nbChar +1 pour anticiper l'espace que l'on rajoute a la fin d'un mot
            if(nbChar+1 <= columnNumber || (word.length() >= columnNumber && nbWords == 1)){
                //Si c'est une ligne vierge on ajoute le mot
                if(textRow.length() == 0)
                {
                    textRow.append(word);
                }
                //Sinon on rajoute un espace avec le mot, nbChar augmente donc de 1
                else {
                    textRow.append(" ").append(word);
                    nbChar++;
                }

            //Sinon on fait un saut de ligne et on ajoute le mot
            }
            else {
                textRow.append("\n");
                textRow.append(word);

                //Le nombre de caractère vaut alors la longueur du mot que l'on vient d'insérer sur la nouvelle ligne
                nbChar = word.length();
                //1 mot sur la nouvelle ligne
                nbWords = 1;
            }
        }
        return textRow.toString();
    }
}
