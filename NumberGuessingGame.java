import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
    public static void main(String[]args){
        try(Scanner kb=new Scanner(System.in)){
            Random random=new Random();
            int minRange=1;
            int maxRange=100;
            int attemp,maxAttempts=5;
            int score=0;
            String st;
            System.out.println("Welcome to the number guessing game");
            do{
                int targetNumber=random.nextInt(maxRange - minRange +1)+ minRange;
                System.out.println("\nNew round started! Gusse the number between "+minRange +" to"+ maxRange);
                for(attemp=1;attemp<=maxAttempts;attemp++){
                    System.out.println("\nAttemp # "+ attemp + ": Enter your guess:");
                   int guess=kb.nextInt();
             if(guess==targetNumber){
                 System.out.println("congratulation youguass correct number");
                 score++;
                 break;
               }
             else if( guess< targetNumber){
                 System.out.println("to low! try again.");
             }
             else{
                 System.out.println("too high! try again.");
              }
            }
             if(attemp== maxAttempts){
                 System.out.println("sorry , you have run out of attemps. The correct score was : "+ targetNumber);
             }
                System.out.println("do you want to play again ?(yes/no)");
                 st= kb.next();
            }
              while(st.equalsIgnoreCase("yes"));
              System.out.println("/n Game over! your final score is: "+ score);
              }
        }
    }