import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqueakyClean {
    public static String clean(String identifier) {
        String step1 = identifier.replaceAll("\\s", "_");

        Matcher matcher = Pattern.compile("-(\\w)").matcher(step1);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        String step2 = sb.toString();

        String step3 = step2.replaceAll("4", "a")
                .replaceAll("3", "e")
                .replaceAll("0", "o")
                .replaceAll("1", "l")
                .replaceAll("7", "t");

        String step4 = step3.replaceAll("[^a-zA-Z_]", "");

        return step4;
    }
}

//class SqueakyClean {
//    public static String clean(String identifier) {
//
//        StringBuilder cleanedIdentifier = new StringBuilder();
//        for (int i = 0; i < identifier.length(); i++) {
//            char c = identifier.charAt(i);
//            if (Character.isWhitespace(c)){
//                cleanedIdentifier.append('_');
//            }
//            else if (c == '-'){
//                cleanedIdentifier.append(Character.toUpperCase(identifier.charAt(i+1)));
//                i++;
//            }
//            if (Character.isDigit(c)){
//                switch(c) {
//                    case '4':
//                        cleanedIdentifier.append('a');
//                        break;
//                    case '3':
//                        cleanedIdentifier.append('e');
//                        break;
//                    case '0':
//                        cleanedIdentifier.append('o');
//                        break;
//                    case '1':
//                        cleanedIdentifier.append('l');
//                        break;
//                    case '7':
//                        cleanedIdentifier.append('t');
//                        break;
//                }
//            }
//            else if (Character.isLetter(c)){
//                cleanedIdentifier.append(c);
//            }
//        }
//        return cleanedIdentifier.toString().replaceAll("[^a-zA-Z_]", "");
//    }
//}