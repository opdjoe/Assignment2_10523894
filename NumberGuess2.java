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
public class NumberGuess2 {
   public static void main(String[] args) {
       
       Random r = new Random();
       Scanner input=new Scanner(System.in);
       int num;
       int secret =r.nextInt(10); 
       

       System.out.println("I'm thinking of a number from 1-10");
       System.out.print("YOUR GUESS : ");
       num=input.nextInt();
       if(num==secret){
           System.out.print("Thats right! my secret number was :"+secret);
       }
       else
           System.out.print("sorry My secret number was :"+secret);

   }
}
