import java.util.HashMap;
import java.util.Map;
public class OOPSBannerApp {

    /**
     * Builds and returns a map containing
     * ASCII banner patterns for characters.
     *
     * @return Map<Character, String[]>
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        patternMap.put('P', new String[]{
                "  ****** ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        patternMap.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        return patternMap;
    }

    /**
     * Renders the banner message using the map.
     *
     * @param message text to display
     * @param patternMap character pattern map
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append(" ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}
