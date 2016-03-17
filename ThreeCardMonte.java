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
public class ThreeCardMonte {
    public static void main(String[] args){
    
       Scanner input= new Scanner(System.in);
       Random r     = new Random(); 
       int num; 
        
        
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
"He glances at you out of the corner of his eye and starts shuffling.\n" +
"He lays down three cards.");
   
    System.out.println("\nWhich one is the Ace ?");
    System.out.println("##    ##    ##\n##    ##    ##\n1     2     3");
    num =input.nextInt();
      int secret;
        secret = r.nextInt(3);
    if (num!=secret){
        
        System.out.println("Ha! Fast Eddie wins again! The ace was card number :"+secret);
        System.out.println("##    ##    ##\n##    ##    ##\n1     2     3");
        
        
    }
   
   
   
   
   
   
   
   
   
    }
}
