/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjackmarvel;


import java.util.Scanner;

/**
 * Handles all Player specific operations
 */
public class Player extends Person {

    Scanner input = new Scanner(System.in);

    //Create a new Player with custom name
    public Player() {
        super.setName(super.getName());

    }

    //Allow the player to make decisions
    public void makeDecision(Deck deck, Deck discard) {

        int  decision = 0;
        boolean getNum = true;

        while(getNum){

            try{
                System.out.println("Would you like to: 1) Hit or 2) Stand (1/2)");
                decision = input.nextInt();
                getNum = false;

            }
            catch(Exception e){
                System.out.println("Invalid Option.Please try again.");
                input.next();
            }
            //we don't close the scanner, because we will need it later.
        }

        if (decision == 1) {
            this.hit(deck, discard);
            //return if they have blackjack or busted
            if(this.getHand().calculatedValue()>20){
                return;
            }
            else{
                this.makeDecision(deck, discard);
            }

        } else {
            System.out.println("You stand.");
        }


    }


}
