package examples;

public class Overflow {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        if (y < x) {
            System.out.println("examples.Overflow!!!");
        }
        System.out.println(y);
    }
}
