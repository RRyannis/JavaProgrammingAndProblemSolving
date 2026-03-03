package dev.java;

import java.io.*;
import java.util.Scanner;

public class BinaryFileIO {
    public static void main(String[] args) {
        String fileName = "numbers.dat";
        try{

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter nonnegative integers.");
            System.out.println("Enter a negative one to end.");
            int anInteger;
            do {
                anInteger = keyboard.nextInt();
                outputStream.writeInt(anInteger);
            } while (anInteger >= 0);
            System.out.println("Numbers and sentinel value");
            System.out.println("written to the file " + fileName);
            outputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("Problem opening file " + fileName);
        } catch (IOException e){
            System.out.println("Problem with output to file " + fileName);
        }
    }

}
