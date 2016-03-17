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
public class CountingWhile {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
                
                
		System.out.println( "Type in a message, and I'll display it " );
		
                
                System.out.print( "Message: " );
               String message = keyboard.nextLine();
               System.out.print("how many times ? ");
                int times=keyboard.nextInt();
		int n = 0;
		while ( n < times *10)
		{
			System.out.println( (n+10) + ". " + message );
			n+=10;
		}

	}
}


/*
1.n++ increases the counter variable in order to reach its condion
when removed ,the block continues to execute provided it meet the condition



*/