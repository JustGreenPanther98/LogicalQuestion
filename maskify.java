public class maskify {
    public static String maskify_(String str) {
        int j = 4;
        String code = "";

        if (str.length() > j) {
            for (int i = 0; i < str.length(); i++) {
                if (i >= str.length() - j) {
                    code += str.charAt(i); 
                } else {
                    code += "#";
                }
            }
        } else {
            return str; // Properly return the unmasked password
        }

        return code;
    }

    public static void main(String[] args) {
        System.out.println("Actual Output: " + maskify_("2157510703982"));
        System.out.println("Actual Output: " + maskify_("6272521"));
        System.out.println("Edge: " + maskify_("0014"));
        System.out.println("Short: " + maskify_("/b"));
        System.out.println("Single: " + maskify_("9"));
    }
}
