package com.mennomuller;

public class Main {

    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int i) {
        StringBuilder output = new StringBuilder();
        if (i % 3 == 0) {
            output.append("Fizz");
        }
        if (i % 5 == 0) {
            output.append("Buzz");
        }
        if (output.isEmpty()) {
            output.append(i);
        }
        return output.toString();
    }
}
