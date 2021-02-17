package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List<Card> cardList;

    public DeckOfCards() {
        Card[] cards = new Card[52];
        int count = 0; //number of cards

        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.Face face : Card.Face.values()) {
                cards[count] = new Card(face, suit);
                ++count;
            }
        }

        cardList = Arrays.asList(cards);
        Collections.shuffle(cardList);
    }

    public void printCards() {
        cardList.forEach(card -> System.out.println(card + " "));
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.printCards();
    }

}
