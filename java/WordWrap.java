import java.sql.SQLOutput;

public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        String newString = new String();
        int index=1;
        boolean test;

        for(int i = 0; i<input.length(); i++){
            test=false;
            if(index>=columnNumber && input.charAt(i)==' '){
                newString+='\n';
                index=0;
            }
            else if(input.charAt(i)==' '){
                for(int j = 1; j<=(columnNumber-index)+1; j++){
                    if((i+j+1<input.length() && input.charAt(i+j)==' ') || i+j==input.length()){
                        test=true;
                    }
                    if(i+j+1<input.length() && (j==columnNumber-index+1 && input.charAt(i+j)==' ')){
                        test=true;
                    }

                }
                if(test==false){
                    newString+='\n';
                    index=0;
                }else{newString += input.charAt(i);}
            }
            else{
                newString += input.charAt(i);
            }

            index++;
        }

        return newString;
    }
}
