package examples;

// Every class that implements the Comparable interface
// has a compareTo() method.

import java.util.Comparator;

public class CompareDemo implements Comparator<String> {
    public static void main(String[] args) {
        String s = "hello";
        String t = "goodbye";
        System.out.println("s < t ?  " + s.compareTo(t));
        System.out.println("s == s ? " + s.compareTo(s));
        System.out.println("t < s ?  " + t.compareTo(s));

        CompareDemo cd = new CompareDemo();
        System.out.println("s < t ?  " + cd.compare(s, t));
        System.out.println("s == s ? " + cd.compare(s, s));
        System.out.println("t < s ?  " + cd.compare(t, s));
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.compareTo(o2) > 0) {
            return -1;
        } else if (o1.compareTo(o2) < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
