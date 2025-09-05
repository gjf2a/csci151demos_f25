public class StringEq {
    public static void main(String[] args) {
        String s = "name"; // new heap allocation
        String t = s; // Shares heap storage with s
        String u = "na" + "me"; // new heap allocation

        System.out.println(s == t); // true
        System.out.println(s.equals(t)); // true
        System.out.println(s == u); // unreliable
        System.out.println(s.equals(u)); // true
    }
}
