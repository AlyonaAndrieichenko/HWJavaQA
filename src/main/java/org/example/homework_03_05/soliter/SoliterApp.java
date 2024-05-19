package org.example.homework_03_05.soliter;

import java.util.Stack;

public class SoliterApp {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Stack<Suit> stack = new Stack<>();
        for (int i = 0; i < deck.getCards().size(); i++) {
            Suit temp = deck.getCards().get(i).getSuit();
            if (!stack.isEmpty() && stack.peek() == temp) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }

        System.out.println(stack);
    }
}
