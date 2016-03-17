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
public class AddingValuesInALoop {
    public static void main(String [] args){
        int num=0;
        int sum=0;
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("i will add all the numbers you give me :");
        
        System.out.println("Number");
        num=input.nextInt();
        
       
        while(num !=0)
        {
            System.out.println("Number");
            sum = sum + num;
            System.out.println("The total so far is " + sum);
            num=input.nextInt();
        }
        
         System.out.println(sum);
            
        
        
        
    }
}
