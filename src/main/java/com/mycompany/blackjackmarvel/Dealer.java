/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjackmarvel;

public class Dealer extends Person{
    

    //Dealer Consructor
    public Dealer(){

        //Name the dealer "Dealer"
        
        super.setName("Dealer");

    }

    //prints the Dealer's face up and face down cards
    public void printFirstHand(){
        System.out.println("Dealer's Hand Face Card Up:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("Dealer's Hand Face Card Down:");
    }



}
