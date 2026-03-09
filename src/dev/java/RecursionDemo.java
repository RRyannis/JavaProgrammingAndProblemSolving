package dev.java;

public class RecursionDemo {
    public static void main(String[] args) {
        //System.out.println(factorial(3));
        //System.out.println(sum(4));
        System.out.println(fibonacci(6));
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n*factorial(n-1);
    }
    private static int sum(int i){
        if (i == 0) return 0;
        return i + sum(i-1);
    }
    private static int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n -2);
    }
}
