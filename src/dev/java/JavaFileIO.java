package dev.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class JavaFileIO {
    public static void main(String[] args) {
//        String fileName = "test.txt";
//        PrintWriter outputStream = null;
//        try{
//            outputStream = new PrintWriter(new FileOutputStream(fileName, true)); // or simply new PrintWriter(filename);
//        } catch (FileNotFoundException e){
//            System.out.println("Error opening file.");
//            System.exit(0);
//        }
//        System.out.println("Enter three lines of text");
//        Scanner keyboard = new Scanner(System.in);
//        for (int count = 0; count < 3; count ++){
//            String line = keyboard.nextLine();
//            outputStream.println(count + " " + line);
//        }
//        outputStream.close();
//        System.out.println("The provided lines have been written in the txt file.");
        String fileName = "test.txt";
        Scanner inputStream = null;
        System.out.println("The file " + fileName +
                "\ncontains the following lines:\n");
        try {
            inputStream = new Scanner(new File(fileName));
        } catch (FileNotFoundException e){
            System.out.println("Error opening the file " +
                    fileName);
            System.exit(0);
        }
        while(inputStream.hasNextLine()){
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        inputStream.close();
    }
}
