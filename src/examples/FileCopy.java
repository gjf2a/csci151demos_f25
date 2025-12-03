package examples;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name of file to copy: ");
        String sourceFilename = keyboard.nextLine();
        System.out.print("Enter name of copied file: ");
        String destinationFilename = keyboard.nextLine();

        try {
            Scanner fileInput = new Scanner(new File(sourceFilename));
            PrintWriter fileOutput = new PrintWriter(new FileWriter(destinationFilename));

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                fileOutput.println(line);
            }

            fileInput.close();
            fileOutput.close();
        } catch (FileNotFoundException e) {
            System.out.println("Source file '" + sourceFilename + "' cannot be found");
        } catch (IOException e) {
            System.out.println("Destination file '" + destinationFilename + "' cannot be written");
        }
    }
}
