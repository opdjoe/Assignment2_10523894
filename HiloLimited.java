/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author opdjoe
 */
    

public class HiloLimited {
    public  static void main(String[] args) {
        Random ran = new Random();
        Scanner num = new Scanner(System.in);
        int rand   = 1 +ran.nextInt(4);
        int nt =0;
        int i  = 2;
        
        System.out.print("I'm thinking of a number between 1-100. ");
        System.out.printf("You have 7 guesses to make \n");
        System.out.println("Your guess:");
         
        int guess;
        
        while(true)
        {
            guess = num.nextInt();
            if(rand == guess)
            {
                System.out.println("You guessed it!  What are the odds?!?");
                break;
        }
            else if(rand >guess){
                System.out.println("Sorry, you are too low");
                System.out.println("Guess #:" + i);
                nt =nt +1;
            }
            else if(rand <guess ){
                System.out.println("Sorry that guess is too high");
                System.out.println("Guess #:" + i); 
                nt = nt+1;
            }
            

                i++;   
        if (nt ==7){
            System.out.println("Sorry you did not guess it in 7 tries");
            break;
        }
        }
        
                    
        
                       
        
        
        
    }
}


