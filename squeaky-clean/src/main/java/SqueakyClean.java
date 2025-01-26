
// TEST MULTI MODULE GRADLE PROJECT 1
class SqueakyClean {
    public static String clean(String identifier) {

        StringBuilder cleanedIdentifier = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isWhitespace(c)){
                cleanedIdentifier.append('_');
            }
            else if (c == '-'){
                cleanedIdentifier.append(Character.toUpperCase(identifier.charAt(i+1)));
                i++;
            }
            if (Character.isDigit(c)){
                switch(c) {
                    case '4':
                        cleanedIdentifier.append('a');
                        break;
                    case '3':
                        cleanedIdentifier.append('e');
                        break;
                    case '0':
                        cleanedIdentifier.append('o');
                        break;
                    case '1':
                        cleanedIdentifier.append('l');
                        break;
                    case '7':
                        cleanedIdentifier.append('t');
                        break;
                }
            }
            else if (Character.isLetter(c)){
                cleanedIdentifier.append(c);
            }
        }
        return cleanedIdentifier.toString().replaceAll("[^a-zA-Z_]", "");
    }
}