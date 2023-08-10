/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.blackjackmarvel;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

//    /**
//     * Test of addCard method, of class Deck.
//     */
//    @Test
//    public void testAddCard() {
//        System.out.println("addCard");
//        Card card = null;
//        Deck instance = new Deck();
//        instance.addCard(card);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addCards method, of class Deck.
//     */
//    @Test
//    public void testAddCards() {
//        System.out.println("addCards");
//        ArrayList<Card> cards = null;
//        Deck instance = new Deck();
//        instance.addCards(cards);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Deck.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Deck instance = new Deck();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of shuffle method, of class Deck.
//     */
//    @Test
//    public void testShuffle() {
//        System.out.println("shuffle");
//        Deck instance = new Deck();
//        instance.shuffle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of pickCard method, of class Deck.
//     */
//    @Test
//    public void testPickCard() {
//        System.out.println("pickCard");
//        Deck instance = new Deck();
//        Card expResult = null;
//        Card result = instance.pickCard();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of containsCards method, of class Deck.
     */
   @org.junit.jupiter.api.Test
   
    public void testContainsCardsGood() {
        System.out.println("containsCards Good");
        Deck instance = new Deck();
        int size =4;
        boolean expResult = true;
        boolean result = instance.containsCards(size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of remainingCards method, of class Deck.
//     */
//    @Test
//    public void testRemainingCards() {
//        System.out.println("remainingCards");
//        Deck instance = new Deck();
//        int expResult = 0;
//        int result = instance.remainingCards();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCards method, of class Deck.
//     */
//    @Test
//    public void testGetCards() {
//        System.out.println("getCards");
//        Deck instance = new Deck();
//        ArrayList<Card> expResult = null;
//        ArrayList<Card> result = instance.getCards();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of emptyDeck method, of class Deck.
//     */
//    @Test
//    public void testEmptyDeck() {
//        System.out.println("emptyDeck");
//        Deck instance = new Deck();
//        instance.emptyDeck();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reloadDeckFromDiscard method, of class Deck.
//     */
//    @Test
//    public void testReloadDeckFromDiscard() {
//        System.out.println("reloadDeckFromDiscard");
//        Deck discard = null;
//        Deck instance = new Deck();
//        instance.reloadDeckFromDiscard(discard);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
