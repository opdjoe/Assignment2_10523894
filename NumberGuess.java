/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author opdjoe
 */
public class NumberGuess {
   public static void main(String[] args) {
       
       Scanner input=new Scanner(System.in);
       int num;
       int secret=4;
       System.out.println("THE WORST NUMBER GAME EVER ");

       System.out.print("I'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS : ");
       num=input.nextInt();
       if(num==secret){
           System.out.print("LOL!! U GOT IT! I CANT BELIEVE U GUESSED IT WAS: ^"+secret);
       }
       else
           System.out.print("NO! NO! UR GUESS WAS WRONG...IT WAS ACTUALLY :"+secret);

   }
}
