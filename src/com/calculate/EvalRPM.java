package com.calculate;

import java.util.LinkedList;

public class EvalRPM {

    public static int evalRPM(String ko){
        LinkedList<Integer> stack = new LinkedList<>();
        String[] token = new String[ko.length()];
        for (int i = 0; i < ko.length(); i++) {
            token[i] = String.valueOf(ko.charAt(i));
        }
        for (String t : token) {
            switch (t){
                case "+"->{
                    Integer b = stack.pop();
                    Integer a = stack.pop();
                    stack.push(a + b);
                }
                case "-"->{
                    Integer b = stack.pop();
                    Integer a = stack.pop();
                    stack.push(a - b);
                }
                case "*"->{
                    Integer b = stack.pop();
                    Integer a = stack.pop();
                    stack.push(a * b);
                }
                case "/"->{
                    Integer b = stack.pop();
                    Integer a = stack.pop();
                    stack.push(a / b);
                }
                default -> {
                    stack.push(Integer.parseInt(t));
                }
            }
        }
        return stack.pop();
    }
}