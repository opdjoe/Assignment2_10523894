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
public class SafeSquareRoot {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        float sqt;
   System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number : ");
        num=input.nextInt();
      while (num<0){
        System.out.println("You cant find the Square root of a negative number.");
        System.out.print("Try Again : ");
        num=input.nextInt();  
    
      }
        while(num>0){
   
        sqt=(float) Math.sqrt(num);
        System.out.print("The square of "+num+ " is "+sqt);
      break;
        }
      
    
        
        
        
    }
}
