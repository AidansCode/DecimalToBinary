package com.aidanmurphey.decimaltobinary;

import java.util.Stack;

public class Converter {
    
    private int decimal;
    private Stack<Integer> stack;

    /**
     * Constructor for Converter class
     * @param decimal The decimal integer to be converted
     */
    public Converter(int decimal){
        this.decimal = decimal;
        stack = new Stack();
    }

    /**
     * Converts the supplied decimal in the constructor to binary and returns the binary as a string
     * @return The supplied decimal integer converted to binary
     */
    public String decimalToBinary() {
        decimalToBinary(this.decimal);
        
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        
        return builder.toString();
    }

    /**
     * Uses recursion to convert a given decimal integer to binary. Uses the class's stack member variable.
     * Called by the other decimalToBinary method
     * @param decimal The supplied decimal integer to be converted to binary
     */
    private void decimalToBinary(int decimal) {
        int q = decimal / 2;
        int r = decimal % 2;
        
        stack.push(r);
        
        if (q > 0)
            decimalToBinary(q);
    }

}
