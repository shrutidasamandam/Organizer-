// !! NOTE: This is a placeholder class !!
// You may delete the contents of this file and put your project here :) 
// 
// You are encouraged to break your code into multiple files and
// not write all the code in this single file. 
//
// Remember this is our "Final" project but the intent of this project
// is to have fun and illustrate what you have learned this year. 
// I'm just looking for you to try something and I'm not looking for 
// perfection. Be creative and have fun with it :)  
import java.util.Arrays;

import java.util.Scanner;

public class App {


	    public static void main(String[] args)

	    {

	    System.out.println("Hello! Welcome to your own list organizer");

	    System.out.println("This program helps to organize your shopping list by alphabetical order");

	    System.out.println("This program allows you to organize up to 10 items!");

	        Scanner userInput = new Scanner(System.in);

	        String[] userArr = new String[10];

	        for (int i = 0; i <userArr.length ; i++) {

	            System.out.print("Enter "+(i+1)+" word: ");

	            userArr[i] = userInput.nextLine();

	        }


	        Arrays.sort(userArr);

	        System.out.println("The alphabetical order of words is: ");

	        for (int i = 0; i <userArr.length ; i++) {

	            System.out.println(userArr[i]);

	        }

	    }

	}


}
