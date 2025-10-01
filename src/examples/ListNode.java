package examples;

import java.util.Scanner;

public class ListNode<T> {
    private T value;
    private ListNode<T> next;

    public ListNode(T value, ListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public String toString() {
        if (next == null) {
            return value.toString();
        } else {
            return value + " -> " + next.toString();
        }
    }

    public String backwards() {
        if (next == null) {
            return value.toString();
        } else {
            return next.backwards() + " -> " + value;
        }
    }

    public static void main(String[] args) {
        ListNode<Integer> nums = null;
        for (int i = 0; i < 5; i++) {
            nums = new ListNode<>(i, nums);
        }
        System.out.println("forwards:  " + nums);
        System.out.println("backwards: " + nums.backwards());

        ListNode<String> strs = null;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string (quit to quit): ");
            String line = s.nextLine();
            if (line.equals("quit")) {
                 break;
            }
            strs = new ListNode<>(line, strs);
        }

        System.out.println("You entered, in reverse: " + strs);
    }
}
