package com.aidanmurphey.decimaltobinary;

import java.util.Scanner;

public class DecimalToBinaryDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        
        do {
            System.out.print("Enter a positive decimal integer: ");
            input = scanner.nextInt();
            if (input >= 0) {
                Converter converter = new Converter(input);
                System.out.println(converter.decimalToBinary());
            }
        } while (input >= 0);
        System.out.println("Ending program...");

        scanner.close();
        
    }
    
}
