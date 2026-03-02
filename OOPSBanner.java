public class OOPSBANNERAPP {

public static void main(String args[]) {



   import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp7 {

    // CharacterPattern Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
public class OOPSBannerApp8 {

    // Central Pattern Storage
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "** ",
                "*   *",
                "*   *",
                "** ",
                "**     ",
                "**     ",
                "**     "
        });

        patternMap.put('S', new String[]{
                " *** ",
                "**     ",
                "**     ",
                " *** ",
                "     **",
                "     **",
                " *** "
        });
}

    // CharacterPatternMap Class
    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> map = new HashMap<>();

        static {
            map.put('O', new CharacterPattern('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }));

            map.put('P', new CharacterPattern('P', new String[]{
                    "** ",
                    "*   *",
                    "*   *",
                    "** ",
                    "**     ",
                    "**     ",
                    "**     "
            }));

            map.put('S', new CharacterPattern('S', new String[]{
                    " *** ",
                    "**     ",
                    "**     ",
                    " *** ",
                    "     **",
                    "     **",
                    " *** "
            }));
        }

        public static CharacterPattern getPattern(char ch) {
            return map.get(ch);
        }
    }
    // Render Function
    static void renderBanner(String word) {

    public static void main(String[] args) {

        public class OOPSBANNERAPP{

    // Class to store character and its pattern
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    // Create pattern mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
"  ***   ",
" *   *  ",
" *   *  ",
" *   *  ",
" *   *  ",
" *   *  ",
"  ***   "
        };

        String[] P = {
"  **  ",
" *    * ",
" *    * ",
" **   ",
" **       ",
" **       ",
" **       "
        };

        String[] S = {
"  **  ",
" **       ",
" **       ",
"  **  ",
"       ** ",
" *    * ",
"  **  "
        };

        return new CharacterPatternMap[] {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };
    }

    // Get pattern for character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return null;
    }
// Print banner
public static void printMessage(String message, CharacterPatternMap[] charMaps) {

    int height = charMaps[0].pattern.length;

    for (int row = 0; row < height; row++) {
        for (int i = 0; i < message.length(); i++) {
            String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
            if (pattern != null) {
                System.out.print(pattern[row] + "   ");
            }
        }
        System.out.println();
    }
}

// Main method
public static void main(String[] args) {

    CharacterPatternMap[] charMaps = createCharacterPatternMaps();
    String message = "OOPS";
    printMessage(message, charMaps);
}
}