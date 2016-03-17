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
public class CollatzSequence {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting number:");
        int num  = input.nextInt();
        int i = 0;
        int max =0;
        while(num !=1){
            if (num%2 ==0){
                num = num/2;
                System.out.print("\t" +num);
                i++;
            }
            else
                num  = (num*3) +1;
                System.out.print("\t" +num);
                i++;
            if (num>max){
                max  = num;
            }
        
        }
    System.out.println();
    System.out.println("Terminated after " + i +"steps");  
    System.out.println("The largest number is " + max);
    }
}
