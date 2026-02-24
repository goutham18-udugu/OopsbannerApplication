public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // Store banner lines in String array
        String[] banner = {
            "  *****   *****   *****   *****  ",
            "  *   *   *   *   *   *   *      ",
            "  *****   *****   *****   *****  ",
            "  *       *   *   *       *      ",
            "  *       *   *   *       *****  "
        };

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}