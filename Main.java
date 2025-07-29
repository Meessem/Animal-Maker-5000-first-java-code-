package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
        Scanner input = new Scanner(System.in);
            System.out.println("Welcome to mob presenter!");  
            System.out.println("");  
        // the variables
        System.out.print("Enter youre animal's name: ");
        String name = input.nextLine();
        System.out.print("Enter your type of animal: ");
        String type = input.nextLine();          // reads input from use
        System.out.print("Enter its age: ");
        String age = input.nextLine();
        System.out.print("Is its age specified in days months or years: ");
        String timescale = input.nextLine();
        System.out.print("Enter its gender: ");
        String gender = input.nextLine();
        System.out.print("Is it a he or she?: ");
        String gend = input.nextLine();
        // the output 
        System.out.println(" ");
        System.out.println("-------------");
        System.out.println("  ");
        System.out.println("Youre animal is presenting itsself ");
        System.out.println("  ");
        System.out.println("-------------");
        System.out.println("  ");
        System.out.println("" + name);
        System.out.println("This " + gender + " is a " + type);
        System.out.println("And " + gend + " is " + age + " " + timescale + " old");
         System.out.println(" ");  
System.out.println(" ");     
        System.out.println(" ");      
            System.out.println(" ");  
            System.out.println("New animal !");  
            System.out.println(" ");  
            
    }
    }
          }
