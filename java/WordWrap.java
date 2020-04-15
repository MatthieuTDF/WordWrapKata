
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        // TODO
       int i = 0;
       int j;
       boolean right = false;
        boolean left = false;
       StringBuilder sb = new StringBuilder( input );
       for ( i= 0, j= 0; i < input.length(); i++, j = 0){

           if ( i < input.length() - columnNumber ){
               if ( input.charAt( i + columnNumber ) == ' ' ){
                   sb.setCharAt( i + columnNumber, '\n' );
                   input = sb.toString();
                   i += columnNumber;
               }
               else {
                   while ( j < columnNumber && input.charAt( i + columnNumber - j) != ' ' ){
                       j++;
                       if ( input.charAt( i + columnNumber - j) != ' ')
                           left = false;
                       else
                           left = true;
                   }
                   if ( left ){
                       sb.setCharAt( i + columnNumber - j, '\n' );
                       input = sb.toString();
                       i += columnNumber - j;
                   }
                   else {
                       while ( j < columnNumber && input.charAt( i + columnNumber + j ) != ' '){
                           j++;
                           if ( input.charAt( i + columnNumber + j ) != ' ' )
                               right = false;
                           else
                               right = true;
                       }
                       if ( right ) {
                           sb.setCharAt( i + columnNumber + j, '\n');
                           input = sb.toString();
                           i += columnNumber + j;
                       }
                       else {
                           input = sb.toString();
                       }
                   }


               }
           }
       }

        return input;
    }
}
