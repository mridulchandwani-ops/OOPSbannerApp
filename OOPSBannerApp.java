class OOPSBannerApp
{
    public static void main(String[] args) {
        // UC5: Combining array declaration and initialization in a single statement
        // Using String.join() to create the pattern for each of the 7 lines
        String[] bannerLines = {
            String.join("", "***** ", " * * ", " * * ", " * * ", "***** "), // Line 1
            String.join("", "* * ", "* *", "* *", "* *", "* * "), // Line 2
            String.join("", "* * ", "* *", "* *", "* *", "* * "), // Line 3
            String.join("", "***** ", "* *", "* *", "* *", "***** "), // Line 4
            String.join("", "* ", "* *", "* *", "* *", "* "), // Line 5
            String.join("", "* ", "* *", "* *", "* *", "* "), // Line 6
            String.join("", "* ", " * * ", " * * ", " * * ", "* ")  // Line 7
        };

        // UC5: Utilizing an enhanced for loop to display the output efficiently
        System.out.println("--- UC5 Banner Output ---");
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}