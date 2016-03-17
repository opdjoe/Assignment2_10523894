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
public class KeepGuessing {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int SecretNum=9;   
        
        System.out.println("i have chosen a number beteen 1 and 10");
		System.out.print("your Guess: ");
		int guess = input.nextInt();

		while ( guess!= SecretNum )
		{
			System.out.println("\nThat is incorrect. Guess again");
			System.out.print("your Guess: ");
			guess = input.nextInt();
		}

		System.out.println("\nThats right! your are a good guesser..hihi");
        
        
        
    }
}
