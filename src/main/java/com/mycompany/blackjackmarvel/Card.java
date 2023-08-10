/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjackmarvel;

public class Card implements Comparable<Card>{

     private Suit suit;
     private Rank rank;

//Constructor with 2 Arguments
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

   // Constructor with 1 argument
    public Card(Card card){
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    /**
     *
     * @return  The numerical value of the Card
     */
    public int getValue(){
        return rank.rankValue;
    }

    
    //getters for suit
    public Suit getSuit(){
        return suit;
    }
//getters for rank
    public Rank getRank(){
        return rank;
    }

    //Card is return with a String message
    public String toString(){
        return ("["+rank+" of "+ suit + "] ("+this.getValue()+")");

    }
    
    //Comparson between cards is done 
    @Override
    public int compareTo(Card c) {
        //if this card is greater than the other card it returns 1
        if(this.getValue() > c.getValue()){
            return 1;
        }
        else if(this.getValue() < c.getValue()){
            //returns -1 if this card is lower than other
            return -1;
        }
        else{
            return 0;
        }
    }
}