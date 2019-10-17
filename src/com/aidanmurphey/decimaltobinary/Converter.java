package com.aidanmurphey.decimaltobinary;

import java.util.Stack;

public class Converter {
    
    private int decimal;
    private Stack<Integer> stack;
    
    public Converter(int decimal){
        this.decimal = decimal;
        stack = new Stack();
    }
    
    public String decimalToBinary() {
        decimalToBinary(this.decimal);
        
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        
        return builder.toString();
    }
    
    private void decimalToBinary(int decimal) {
        int q = decimal / 2;
        int r = decimal % 2;
        
        stack.push(r);
        
        if (q > 0)
            decimalToBinary(q);
    }

}
