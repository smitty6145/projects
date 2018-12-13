/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsaber;

import java.util.Scanner;

/**
 *
 * @author Smith Brandon
 * Note: This is only the basic switch structure of what the program is
 * intended to do utilizing the use of other objects.
 * 
 *
 */
public class LightSaberLand {
    
    public static void main(String[] args){
        // Prints out the user's choices
        System.out.println("****** Please select your race! *******");
        System.out.println("Options");
        System.out.println("1- Human");
        System.out.println("2- Twi'lek");
        System.out.println("3- Togruta");
        System.out.println("4- Mirialan");
        System.out.println("5- Zabrak");
        System.out.println("*******Select your Gender!*********");
        System.out.println("Options");
        System.out.println("1- Male");
        System.out.println("2- Female");
        System.out.println("*******Choose your Path!*********");
        System.out.println("1- Jedi");
        System.out.println("2- Sith");
        System.out.println("*******Choose your Saber's Color!*********");
        System.out.println("Note: Sith Can only choose from either Red or Black");
        System.out.println("Note: Jedi are exempt from choosing Red");
        System.out.println("1- Blue");
        System.out.println("2- Green");
        System.out.println("3- Orange");
        System.out.println("4- Yellow");
        System.out.println("5- Purple");
        System.out.println("6- Red");
        System.out.println("7- Black");
        int choice;
        int selection;
        int option;
        int color;
        
        Scanner scan = new Scanner(System.in);
        
        // Race
        choice = scan.nextInt();
        // Gender
        selection = scan.nextInt();
        // Destiny
        option = scan.nextInt();
        // Color
        color = scan.nextInt();
        
        // User chooses their race
        switch (choice) {
            case 1:
                System.out.println("You are a Human. Strength: 70 / 100");
                break;
            case 2:
                System.out.println("You are a Twi'lek. Strength: 50 / 100");
                break;
            case 3:
                System.out.println("You are a Togruta. Strength: 60 / 100");
                break;
            case 4:
                System.out.println("You are a Mirialan. Strength: 60 / 100");
                break;
            case 5:
                System.out.println("You are a Zabrak. Strength: 90 / 100");
                break;
                
        } // close switch block
        
        // User selects their gender
        switch (selection) {
            case 1:
                System.out.println("You are Male");
                break;
            case 2:
                System.out.println("You are Female");
                break;
        } // close switch block
        
        // User chooses whether they are a Jedi or a Sith
        switch (option) {
            case 1:
                System.out.println("You are a Jedi");
                break;
            case 2:
                System.out.println("You are a Sith");
                break;
        } // close switch block
        
        // User chooses the color of their Lightsaber
        switch (color) {
            case 1:
                System.out.println("Your Lightsaber is Blue");
                break;
            case 2:
                System.out.println("Your Lightsaber is Green");
                break;
            case 3:
                System.out.println("Your Lightsaber is Orange");
                break;
            case 4:
                System.out.println("Your Lightsaber is Yellow");
                break;
            case 5:
                System.out.println("Your Lightsaber is Purple");
                break;
            case 6:
                System.out.println("Your Lightsaber Is Red");
                break;
            case 7:
                System.out.println("Your Lightsaber is Black");
                break;
        } // close switch block
    // Stats are printed after user has made slections for all fields
    
    } // cloe main

} // close class
