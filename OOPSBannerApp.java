import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized Map to store character-to-pattern mappings
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Initialize the centralized repository (Key-Value pairs)
        patternMap.put('O', new String[]{
            " ***** ", "* *", "* *", "* *", "* *", "* *", " ***** "
        });
        patternMap.put('P', new String[]{
            "****** ", "* *", "* *", "****** ", "* ", "* ", "* "
        });
        patternMap.put('S', new String[]{
            " ***** ", "* ", "* ", " ***** ", "      *", "      *", " ***** "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        
        System.out.println("--- UC8: Final Scalable Banner App ---");
        renderBanner(word);
    }

    /**
     * UC8: Centralized rendering function.
     * Separates the "Display Logic" from the "Pattern Storage."
     */
    public static void renderBanner(String input) {
        char[] chars = input.toUpperCase().toCharArray();

        // Standard 7-line ASCII height
        for (int i = 0; i < 7; i++) {
            StringBuilder lineResult = new StringBuilder();
            
            for (char c : chars) {
                // Efficient retrieval using HashMap
                String[] pattern = patternMap.getOrDefault(c, getEmptyPattern());
                lineResult.append(pattern[i]).append("  ");
            }
            
            System.out.println(lineResult.toString());
        }
    }

    // Fallback for characters not in the map
    private static String[] getEmptyPattern() {
        return new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "};
    }
}