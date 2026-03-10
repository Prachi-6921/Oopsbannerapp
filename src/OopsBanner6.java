import java.util.HashMap;
import java.util.Map;

public class OopsBanner6 {

    public static void main(String[] args) {

        String word = "OOPS";

        String[] banner = CharacterPatternMap.buildBanner(word);

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {

        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    "  ***  ",
                    " *   * ",
                    " *   * ",
                    " *   * ",
                    " *   * ",
                    "  ***  ",
                    "       "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    " ****  ",
                    " *   * ",
                    " ****  ",
                    " *     ",
                    " *     ",
                    " *     ",
                    "       "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    "  **** ",
                    " *     ",
                    "  ***  ",
                    "     * ",
                    "     * ",
                    " ****  ",
                    "       "
            }));
        }

        public static String[] buildBanner(String word) {

            int height = 7;
            String[] output = new String[height];

            for (int i = 0; i < height; i++) {
                StringBuilder lineBuilder = new StringBuilder();

                for (char ch : word.toCharArray()) {
                    CharacterPattern pattern = patternMap.get(ch);
                    if (pattern != null) {
                        lineBuilder.append(pattern.getPattern()[i]).append("  ");
                    }
                }

                output[i] = lineBuilder.toString();
            }

            return output;
        }
    }
}