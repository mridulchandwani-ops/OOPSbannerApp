public class OOPSBannerApp{
	public static void main(String[] args) {

        // Banner stored in String array (centralized data structure)
        String[] banner = {
                "************************************",
                "*                                  *",
                "*        WELCOME TO OOPS APP       *",
                "*                                  *",
                "************************************"
        };

        // Using enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}