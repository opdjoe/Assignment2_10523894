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
public class EnterPIN {
    public static void main(String[] args){
     Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
      
    }
}
/*
1.How is a while loop similar to an if statement? 
2.The if statement test for a condition,if true then executes a block of code,whiles
a while statement execute a block of code whiles a condition remain true.
3.The variable entry was declared already while accepting input from the user 
4.Since the varible entery from the user is not equal to the pin given it keeps 
looping forever.
5




*/