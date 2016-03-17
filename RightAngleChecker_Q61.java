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

public class RightAngleChecker_Q61 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter three integers:");
        while(true){
            System.out.print("side1: ");
            int sd1 = input.nextInt();
            System.out.print("side2: ");
            int sd2 = input.nextInt();
            if(sd2<sd1){
                System.out.printf("%d is smaller than %d .Try again",sd2,sd1);
                continue;
                        }
            System.out.print("side3: ");
            int sd3 = input.nextInt();
            if(sd3<sd2){
                System.out.printf("%d is smaller than %d .Try again",sd3,sd2);
                continue;
            }
            System.out.printf("Yout three sides are %d %d %d \n",sd1,sd2,sd3);
            if(sd1<sd2 || sd2<sd3) {
                System.out.println("These sides do make a right triangle");
            }
            else {
                System.out.println("No! These sides do not make a right triangle");               
        }
          break; 
        
    }
    
    }
}
    

