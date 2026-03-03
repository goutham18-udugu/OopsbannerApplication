public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        String text = "WELCOME";

        String[] banner = {
                String.join("", "*".repeat(text.length() + 6)),
                String.join("", "*  ", text, "  *"),
                String.join("", "*".repeat(text.length() + 6)),
                String.join("", "*  ", text.toLowerCase(), "  *"),
                String.join("", "*".repeat(text.length() + 6)),
                String.join("", "*  ", new StringBuilder(text).reverse().toString(), "  *"),
                String.join("", "*".repeat(text.length() + 6))
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}