public class Main {
    public static void main(String[] args) {
        System.out.format("Java StringBuilder examples using java version: %s%n", getJavaVersion());
        verify_replace_works();
    }

    private static void verify_replace_works() {
        String original_text = "ABCDEFG";
        StringBuilder sbr = new StringBuilder(original_text);
        System.out.format("Original string of length %d: %s%n", sbr.length(),  sbr);
        String replacement = "Z";
        int start_index = 0, end_index = sbr.length();
        sbr.replace(start_index, end_index, replacement);
        System.out.format("After replacing from %d to %d with %s, sbr=%s%n", start_index, end_index, replacement, sbr);
    }

    /** get the java version that is running the current program
     * @return string containing the java version running the current program
     */
    private static String getJavaVersion()
    {
        Runtime.Version rtv = Runtime.version();
        return String.format("%s.%s.%s.%s", rtv.feature(), rtv.interim(), rtv.update(), rtv.patch());
    }
}