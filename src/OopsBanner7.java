import java.util.HashMap;
import java.util.Map;

public class OopsBanner7 {
        public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner(word, patternMap);
    }

    // Build character pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return map;
    }

    // Render banner using nested loops
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }
}