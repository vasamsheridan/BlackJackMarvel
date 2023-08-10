/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjackmarvel;

import java.util.ArrayList;
import java.util.Collections;

//Hand of Card 
public class Hand {

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    //Take card from full deck 
    public void takeCardFromDeck(Deck deck){
        hand.add(deck.pickCard());
    }

    //method to discard this hand to discarded deck
    public void discardHandToDeck(Deck discardDeck){

        //copy cards from hand to discardDeck
        discardDeck.addCards(hand);

        //clear the hand
        hand.clear();

    }

   //returning hand with all cards
    public String toString(){
        String output = "";
        for(Card card: hand){
            output += card + " - ";
        }
        return output;
    }


   //calculate card value
    public int calculatedValue(){

        //variable to count number of aces, and current total value
        int value = 0;
        int aceCount = 0;

       
        for(Card card: hand){
            //Add the card value to the hand
            value += card.getValue();
            //Count aces
            if (card.getValue() == 11){
                aceCount ++;
            }
        }
        //if there are multiple aces, aand there is chance of busting go back and set each ace to 1 until get back under 21, if possible
        if (value > 21 && aceCount > 0){
            while(aceCount > 0 && value > 21){
                aceCount --;
                value -= 10;
            }
        }
        return value;

    }


    //index of card we get
    public Card getCard(int index){
        return hand.get(index);
    }



}
