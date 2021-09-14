/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter a 1 if you are male or a 2 if you are female:" );
        Scanner s = new Scanner(System.in);
        String mf = s.nextLine();
        while(!checkNum(mf)){
            System.out.println("Please enter a valid value");
            mf = s.nextLine();
        }
        System.out.println("How many ounces of alcohol did you have?");
        String o = s.nextLine();
        while(!checkNum(o)){
            System.out.println("Please enter a valid value");
            o = s.nextLine();
        }
        System.out.println("What is your weight in pounds?");
        String w = s.nextLine();
        while(!checkNum(w)){
            System.out.println("Please enter a valid value");
            w = s.nextLine();
        }
        System.out.println("How many hours has it been since your last drinks?");
        String h = s.nextLine();
        while(!checkNum(h)){
            System.out.println("Please enter a valid value");
            h = s.nextLine();
        }
        Integer mafe = Integer.valueOf(mf);
        Integer ounce = Integer.valueOf(o);
        Integer weight = Integer.valueOf(w);
        Integer hours = Integer.valueOf(h);
        Double BAC;
        if(mafe == 1){
            BAC = ((((ounce * 5.14)/weight) * 0.73) - (0.015 * hours));
        }
        else{
            BAC = ((((ounce * 5.14)/weight) * 0.66) - (0.015 * hours));
        }
        if(BAC > 0.08){
            System.out.println("Your BAC is " + BAC + "\nIt is not legal for you to drive.");
        }
        else{
            System.out.println("Your BAC is " + BAC + "\nIt is legal for you to drive.");

        }
    }

    public static boolean checkNum(String s){
        try{
            double n = Double.parseDouble(s);
        } catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
