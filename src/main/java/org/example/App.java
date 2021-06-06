/*
 *  UCF COP3330 Summer 2021 Assignment 8
 *  Copyright 2021 Steven Ortiz
 */


//How many people? 8
//How many pizzas do you have? 2
//How many slices per pizza? 8
//8 people with 2 pizzas (16 slices)
//Each person gets 2 pieces of pizza.
//There are 0 leftover pieces.

package org.example;
import java.util.Scanner;

public class App{

    static Scanner in = new Scanner(System.in);

    private static int numPeople(){

        System.out.print("How many people? ");
        String people = in.nextLine();
        int numberPeople = Integer.parseInt(people);
        return numberPeople;

    }

    private static int numPizza(){

        System.out.print("How many pizzas do you have? ");
        String pizzas = in.nextLine();
        int numberPizzas = Integer.parseInt(pizzas);
        return numberPizzas;

    }

    private static int numSlices(){

        System.out.print("How many slices per pizza? ");
        String slices = in.nextLine();
        int numberSlices = Integer.parseInt(slices);
        return numberSlices;

    }

    public static void main(String[] args){

        int numPeopleint = numPeople();
        int numPizzasint= numPizza();
        int numSlicesint = numSlices();

        int totalSlices = numPizzasint * numSlicesint;
        int slicesPerson = totalSlices / numPeopleint;
        int leftoverPizza = numSlicesint % numPeopleint;

        System.out.println(+numPeopleint+ " people with "+numPizzasint+" pizzas ("+totalSlices+" slices)");

        System.out.println("Each person gets "+slicesPerson+" pieces of pizza.");

        System.out.println("There are "+leftoverPizza+" leftover pieces.");

    }
}

