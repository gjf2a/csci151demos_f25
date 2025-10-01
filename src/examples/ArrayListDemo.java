package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Type some text. Type 'quit' to quit.");
        boolean quit = false;
        while (!quit) {
            System.out.print("Enter text: ");
            String text = s.nextLine();
            if (text.equals("quit")) {
                quit = true;
            } else {
                inputs.add(text);
            }
        }

        System.out.println("You entered " + inputs.size() + " lines of text.");

        Iterator<String> iter = inputs.iterator();
        while (iter.hasNext()) {
            String value = iter.next();
            System.out.println("value: " + value);
        }

        for (String value: inputs) {
            System.out.println("value: " + value);
        }

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(i + ": " + inputs.get(i));
        }

        System.out.print("What element do you want to change? ");
        String element = s.nextLine();
        int toChange = Integer.parseInt(element);
        System.out.print("New value at "+ toChange + ": ");
        String newValue = s.nextLine();
        inputs.set(toChange, newValue);

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(i + ": " + inputs.get(i));
        }
    }
}
