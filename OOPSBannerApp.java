class OOPSBannerApp
{
   /**
     * UC7: Static Inner Class to encapsulate character patterns.
     * This follows the Single Responsibility Principle.
     */
    public static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for the pattern array
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {
        // Initialize our "Library" of character patterns
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            " ***** ", "* *", "* *", "* *", "* *", "* *", " ***** "
        });

        CharacterPattern charP = new CharacterPattern('P', new String[]{
            "***** ", "* * ", "* * ", "***** ", "* ", "* ", "* "
        });

        CharacterPattern charS = new CharacterPattern('S', new String[]{
            " ***** ", "* ", "* ", " ***** ", "      *", "      *", " ***** "
        });

        // Store the sequence we want to display
        CharacterPattern[] oopsSequence = { charO, charO, charP, charS };

        // UC7: Using StringBuilder and loop-based rendering for a horizontal banner
        System.out.println("--- UC7 Object-Oriented Horizontal Banner ---");
        
        for (int i = 0; i < 7; i++) { // For each of the 7 lines
            StringBuilder lineBuilder = new StringBuilder();
            
            for (CharacterPattern cp : oopsSequence) { // For each character in the word
                lineBuilder.append(cp.getPattern()[i]).append("  "); // Add pattern + spacing
            }
            
            System.out.println(lineBuilder.toString());
        }
    }
}