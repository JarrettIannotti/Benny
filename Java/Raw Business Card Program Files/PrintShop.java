package edu.iannotjf.Assign04;

import java.util.Scanner;

public class PrintShop {
    
    public static BusinessCard askForBusinessCardData(Scanner input){

        System.out.println("Enter business name:");
        String name = input.nextLine();
        System.out.println("Enter boundary character:");
        String boundaryCharInp = input.nextLine();
        char boundaryChar = boundaryCharInp.charAt(0);
        System.out.println("Enter slogan (max 4 lines):");
        String [] sloganLines = new String[]{input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        BusinessCard card = new BusinessCard(name, sloganLines, boundaryChar);
        return(card);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        BusinessCard card = PrintShop.askForBusinessCardData(input);
        System.out.println("Your new business card:");
        System.out.println (card);





    }
}
