public class OOPSBannerApp{
 public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    private static String[] getCharacterPattern(char target, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap map : patterns) {
            if (map.getCharacter() == target) {
                return map.getPattern();
            }
        }
        return new String[]{" ", " ", " ", " ", " ", " ", " "};
    }

    public static void main(String[] args) {
        String[] patternO = {
            "    ***   ",
            "  **   ** ",
            " **     **",
            " **     **",
            " **     **",
            "  **   ** ",
            "    ***   "
        };

        String[] patternP = {
            "  ******  ",
            " **    ** ",
            " **    ** ",
            " ******  ",
            " **       ",
            " **       ",
            " **       "
        };

        String[] patternS = {
            "  ****** ",
            " **      ",
            " **      ",
            "  *****  ",
            "       **",
            "       **",
            " ******  "
        };

        CharacterPatternMap[] mappings = {
            new CharacterPatternMap('O', patternO),
            new CharacterPatternMap('P', patternP),
            new CharacterPatternMap('S', patternS)
        };

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                line.append(getCharacterPattern(c, mappings)[i]).append("  ");
            }
            System.out.println(line.toString());
        }
    }
}
