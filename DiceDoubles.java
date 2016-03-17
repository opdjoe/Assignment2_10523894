/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author opdjoe
 */
public class DiceDoubles {
    public static void main(String[] args){
    
        Random r=new Random();
        int num1;
        int num2;
        int sum;
        do{
        System.out.println("HERE COMES THE DICE");
        
        num1=r.nextInt(6);
        num2=r.nextInt(6);
        
        sum=num1+num2;
        
        System.out.println("Roll #1 :"+num1);
        System.out.println("Roll #2 :"+num2 );
        System.out.println("the total is : "+sum);
        }
        while(num1!=num2);
        
    }
}
