class OOPSBannerApp
{
   public static void main(String[] args) {
        // UC6: Use static helper methods to populate the array
        // This promotes abstraction and code composition
        String[] bannerLines = {
            getLine(0),
            getLine(1),
            getLine(2),
            getLine(3),
            getLine(4),
            getLine(5),
            getLine(6)
        };

        // Render the final banner using a loop-based system
        System.out.println("--- OOPS Banner (UC6) ---");
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Static helper method to compose a single line of the banner 
     * by combining patterns for O, P, and S.
     */
    public static String getLine(int index) {
        return getPatternO()[index] + "  " + 
               getPatternO()[index] + "  " + 
               getPatternP()[index] + "  " + 
               getPatternS()[index];
    }

    // Static Helper Method for Letter 'O'
    public static String[] getPatternO() {
        return new String[]{
            " ***** ",
            "* *",
            "* *",
            "* *",
            "* *",
            "* *",
            " ***** "
        };
    }

    // Static Helper Method for Letter 'P'
    public static String[] getPatternP() {
        return new String[]{
            "***** ",
            "* * ",
            "* * ",
            "***** ",
            "* ",
            "* ",
            "* "
        };
    }

    // Static Helper Method for Letter 'S'
    public static String[] getPatternS() {
        return new String[]{
            " ***** ",
            "* ",
            "* ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}