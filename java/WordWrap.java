
public class WordWrap {

    public static <$e> String wordWrap(String input, int columnNumber) {
        //initialisation des variables
        String new_text = "";
        String string_temp = null;
        int count = 0,cursor,char_count;
        boolean is_end = false,is_line_ended = false,is_correct = true;
        // TODO

        //boucle tant que nous ne sommes pas à la fin du texte
        while(!is_end) {
            try {

                //reset la variable string temporaire
                string_temp = "";

                //on cherche dans les 20 lettres suivantes la présence d'un espace
                for (cursor=columnNumber;cursor>0;cursor--){
                    if(input.charAt(count+cursor)== ' '){
                        for (char_count=0;char_count<cursor;char_count++)string_temp+=input.charAt(count+char_count);
                        break;
                    }
                }

                //dans le cas ou il n'y a pas d'espace (suite de caractères, en quantité supérieure à l'indice des colonnes
                if (cursor == 0){
                    is_correct=false;
                    while(input.charAt(count+cursor)!= ' '){

                        new_text += input.charAt(count+cursor);
                        cursor ++;
                    }
                }

                is_correct=true;
                string_temp+='\n';
                cursor++;
                count += cursor;
                new_text += string_temp;

                System.out.println(new_text);

            } catch (Exception $e) {
                //fin de la string
                is_end = true;
            }


        }

        if (is_correct){
            try {
                for (cursor = 0; cursor < columnNumber; cursor++) {
                    new_text += input.charAt(count + cursor);
                }
            } catch (Exception $e) {
                //implémentation de la dernière ligne terminée
            }
        }

        return new_text;
    }
}
