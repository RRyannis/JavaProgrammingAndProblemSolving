package dev.java;
import java.util.Locale;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Eoppep {
}
//exam question 49, groub b
//class Example {
//    private int value;
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}

//exam question 50, group b

//class VowelCounter {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a phrase");
//        String phrase = scanner.nextLine().toLowerCase();
//
//        Map<Character, Integer> vowelCount = new HashMap<>();
//        char[] vowels = {'a', 'e', 'o', 'i', 'u'};
//
//        for (char vowel : vowels) {
//            int count = 0;
//            for (char c : phrase.toCharArray()) {
//                if (c == vowel) {
//                    count++;
//                }
//            }
//            vowelCount.put(vowel, count);
//        }
//        System.out.println("Number of vowel appearances: ");
//        for (Map.Entry<Character, Integer> entry:vowelCount.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//    }
//}

//exam question 202, group A


class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        double celsius = 5 * (temperature - 32) / 9;
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}