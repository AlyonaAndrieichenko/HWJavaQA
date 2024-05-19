package org.example.homework_03_05.soliter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        init();
    }

    private void init(){
        for (Rank rank : Rank.values()){
            for (Suit suit : Suit.values()){
                cards.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
