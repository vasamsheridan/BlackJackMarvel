/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.blackjackmarvel;

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
public class PersonTest {
    
    public PersonTest() {
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

    /**
     * Test of getHand method, of class Person.
     */
//    @Test
//    public void testGetHand() {
//        System.out.println("getHand");
//        Person instance = new PersonImpl();
//        Hand expResult = null;
//        Hand result = instance.getHand();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setHand method, of class Person.
     */
//    @Test
//    public void testSetHand() {
//        System.out.println("setHand");
//        Hand hand = null;
//        Person instance = new PersonImpl();
//        instance.setHand(hand);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getName method, of class Person.
     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Person instance = new PersonImpl();
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setName method, of class Person.
     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String name = "";
//        Person instance = new PersonImpl();
//        instance.setName(name);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of printHand method, of class Person.
     */
//    @Test
//    public void testPrintHand() {
//        System.out.println("printHand");
//        Person instance = new PersonImpl();
//        instance.printHand();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of hit method, of class Person.
     */
//    @Test
//    public void testHit() {
//        System.out.println("hit");
//        Deck deck = null;
//        Deck discard = null;
//        Person instance = new PersonImpl();
//        instance.hit(deck, discard);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of hasBlackjack method, of class Person.
     */
    @Test
    public void testHasBlackjackGood() {
        System.out.println("hasBlackjack Good");
        
        Person instance = new Player();
        int Total=instance.getHand().calculatedValue();
        
        
        
        boolean expResult = true;
        boolean result = instance.hasBlackjack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
//    @Test
//    public void testHasBlackjackBad() {
//        System.out.println("hasBlackjack Bad");
//        Person instance = new PersonImpl();
//        boolean expResult = false;
//        boolean result = instance.hasBlackjack();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    @Test
//    public void testHasBlackjackBoundary() {
//        System.out.println("hasBlackjack Boundary");
//        Person instance = new PersonImpl();
//        boolean expResult = false;
//        boolean result = instance.hasBlackjack();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//
    
    
}
