
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        // TODO
        String s = "";
        String[] tab = input.split(" ");
        int x = 0;
        for(int i = 0;i<tab.length;i++){
            if(x+tab[i].length()<=columnNumber){
                s+= tab[i];
                x+=tab[i].length()+1;
            }
            else if(x+tab[i].length()>columnNumber){
                x = 0;
                if(i !=0){
                    s = s.substring(0,s.length()-1)+"\n";
                }
                if(tab[i].length()>columnNumber){

                    s += tab[i];
                }
                else{
                    s += tab[i];
                    x+=tab[i].length()+1;
                }
            }
            if (i<tab.length-1 && tab[i].length()>columnNumber){
                s+="\n";
            }
            else if(i<tab.length-1){
                s+=" ";
            }
        }

        return s;
    }

}
