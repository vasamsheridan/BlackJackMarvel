/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjackmarvel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {

    //An arraylist to hold the deck of Cards
    private ArrayList<Card> deck;


    //Deck Constructor stores values of Cards in Deck
    public Deck(){
        deck = new ArrayList<Card>();
    }

   //Collections.copy() is used to copy the deck
    public Deck(Deck c){
        Collections.copy(this.deck, c.getCards());
    }

    //Makes a Standard Deck
    public Deck(boolean StandardDeck){
        deck = new ArrayList<Card>();
        if(StandardDeck){
            //Go through all the suits
            for(Suit suit : Suit.values()){
                //Go through all the ranks
                for(Rank rank : Rank.values()){
                    //add a new card containing each iterations suit and rank
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }

    //Adding a card to the deck
    public void addCard(Card card){
        deck.add(card);
    }

    //arraylist to add cards to the deck
    public void addCards(ArrayList<Card> cards){
        deck.addAll(cards);
    }

    //Value of Deck returned 
    public String toString(){
       
        String returnValues = "";

        for(Card card: deck){
            returnValues += card;
            returnValues += "\n";
        }
        return returnValues;
    }

    /**
     * Shuffle the deck of Cards at random
     */
    public void shuffle(){
        Collections.shuffle(deck, new Random());
    }

    /**
     *
     * @return The card taken from the deck
     */
    public Card pickCard(){

            //Take a copy of the first card from the deck
            Card cardToPick = new Card(deck.get(0));
            //Remove the card from the deck
            deck.remove(0);
            //Give the card back
            return cardToPick;

    }

    /**
     *
     * @return true if the deck still has cards left
     */
    public boolean containsCards(int size){
        size= deck.size();
        if (size>0){
            return true;
        }
        else{
            return false;
        }
    }

    //Number of cards left
    public int remainingCards(){
        return deck.size();
    }

    //returns arraylist containing all cards
    public ArrayList<Card> getCards() {
        return deck;
    }

    //empties the deck
    public void emptyDeck(){
        deck.clear();
    }


    
    //recreates or reloads new deck after reshuffling and deletion of old deck
    public void reloadDeckFromDiscard(Deck discard){
        this.addCards(discard.getCards());
        this.shuffle();
        discard.emptyDeck();
        System.out.println("Ran out of cards, creating new deck from discard pile & shuffling deck.");
    }


}