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

        String word = "OOPS";
StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
        for (int i = 0; i < 7; i++)
banner[i] = new StringBuilder();
        }

for (char ch : word.toCharArray()) {
            String[] pattern =
                    CharacterPatternMap.getPattern(ch).getPattern();

            String[] pattern = patternMap.get(ch);

for (int i = 0; i < 7; i++) {
banner[i].append(pattern[i]).append(" ");
@@ -84,4 +63,10 @@ public static void main(String[] args) {
System.out.println(line.toString());
}
}

    public static void main(String[] args) {

        initializePatterns();
        renderBanner("OOPS");
    }
}