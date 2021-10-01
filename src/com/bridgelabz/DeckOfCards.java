package com.bridgelabz;

import java.util.Scanner;
/*
DeckOfCards class represents a deck of playing cards
 */
public class DeckOfCards {


    public static void deckOfcards() {
        String[] suits = {"Club", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int sizeOfDeck = suits.length * ranks.length;
        System.out.println("The total number of cards in a Deck is : " + sizeOfDeck);
        String[] deck = new String[sizeOfDeck];

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }
        toPrintDeck(deck);
    }

    private static void toPrintDeck(String[] deck) {
        System.out.println("Cards in Deck are below : ");
        /*
         traversing the elements using for-each loop
         */
        for (String element : deck) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Deck of Cards Program");

        DeckOfCards.deckOfcards();

    }
}
