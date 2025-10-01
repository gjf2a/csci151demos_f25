package examples;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = keyboard.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("That name has " + name.length() + " characters");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        System.out.println("Reversed name: " + reverse(name));
        System.out.println("Number of 'e' in name: " + countChar(name, 'e'));
    }

    public static String reverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }

    public static int countChar(String s, char c) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == c) {
                result += 1;
            }
        }
        return result;
    }
}
