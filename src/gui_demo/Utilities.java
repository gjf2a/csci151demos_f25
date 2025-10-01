package gui_demo;

public class Utilities {
    public static String reversed(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }
}
