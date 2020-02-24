package com.company;
import java.util.Scanner;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack stack = new Stack();
        String line = in.next();
        boolean f = true;
        char x;
        for (int i = 0; i < line.length(); i++) {
            x = line.charAt(i);
            switch (x) {
                case '(':
                case '[':
                case '{':
                    stack.push(x);
                    break;
                case ')':
                    if (!(stack.pop().toString().charAt(0) == ')')) {
                        f = false;
                        break;
                    }
                case ']':
                    if (!(stack.pop().toString().charAt(0) == ']')) {
                        f = false;
                        break;
                    }
                case '}':
                    if (!(stack.pop().toString().charAt(0) == '}')) {
                        f = false;
                        break;
                    }
            }
        }
        if (f) System.out.println("yes");
        else System.out.println("no");
    }
}
