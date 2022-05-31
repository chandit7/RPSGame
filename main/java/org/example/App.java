package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private String result;
    public static String sysChoice(){

        Double val = Math.random() * 3; // 0 - 2.999
        Integer choice = val.intValue();
        switch (choice){
            case 0:
                return "rock";

            case 1:
               return "paper";

            case 2:
                return "scissors";

            default:
               return "default";


        }

    }
    public static void result(String yourChoice, String ComputerChoice){
        if(yourChoice.equals("paper") && ComputerChoice.equals("paper"))
            System.out.println("it is a tie");
        else if (yourChoice.equals("paper") && ComputerChoice.equals("scissors"))
            System.out.println("you lose");
        else if (yourChoice.equals("paper") && ComputerChoice.equals("rock"))
            System.out.println("you lose");
        else if (yourChoice.equals("scissors") && ComputerChoice.equals("paper"))
            System.out.println("you win!");
        else if (yourChoice.equals("scissors") && ComputerChoice.equals("scissors"))
            System.out.println("it is tie!");
        else if (yourChoice.equals("scissors") && ComputerChoice.equals("rock"))
            System.out.println("you lose!");
        else
            System.out.println("else condition");
    }

    public static void main( String[] args )
    {
        System.out.println( "Are you ready to play this game - Y or N?" );
        Scanner scan = new Scanner(System.in);
        String ready = scan.nextLine();
        if(ready.equals("Y"))
            System.out.println("Great! Lets Play Rock Scisors Papers");
        else
            System.out.println("Ok see you next time!!");
        System.out.println("Enter your choice");
        String Choise = scan.nextLine();
       // App game = new App();
        String sysChoice = sysChoice();
        System.out.println("system choice is" + sysChoice);
         result(Choise,sysChoice);
        // Games output

                //scissors

    }
}
