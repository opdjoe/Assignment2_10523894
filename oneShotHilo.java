/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author opdjoe
 */
public class oneShotHilo {
 public static void main(String[] args){
     
     Random r=new Random();
     int x =r.nextInt(100);
     int num;
     Scanner input=new Scanner(System.in);
     System.out.println("i'm thinking of a number between 1-100. Try to guess it");
     num=input.nextInt();
     
     if(num==x){
         System.out.print("You guessed it! what are the odds");
     }
     else if (num >x){
         System.out.print("sorry ,you are too high. i was thinking of : "+x);
         }
     else if (num < x){
         System.out.print("sorry, you are too low. i was thinking of :" +x);
     }
 
 
 
 }   
 
}
