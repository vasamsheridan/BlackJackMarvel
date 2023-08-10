/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjackmarvel;

import java.util.Scanner;

public abstract class Person {
    Scanner scan =new Scanner(System.in);

    private Hand hand;
    private String name;

    //New Person is created
    public Person(){
        this.hand = new Hand();
        this.name = "";
    }


    //Setters and Getters
    public Hand getHand(){
        return this.hand;
    }
    public void setHand(Hand hand){
        this.hand = hand;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        System.out.println("Enter Name");
        name =scan.nextLine();
        this.name = name;
    }

  //Prints person's Hand
    public void printHand(){
        System.out.println("---"+this.name + "'s hand ---");
        System.out.println(this.hand + " Valued at: " + this.hand.calculatedValue());
    }

    //taking card from deck
    public void hit(Deck deck, Deck discard){

        //If there's no cards left in the deck
        if (deck.containsCards(0)) {
            
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
        System.out.println(this.name + " gets a card");
        this.printHand();
       

    }

    public boolean hasBlackjack(){
        if(this.getHand().calculatedValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }



}
