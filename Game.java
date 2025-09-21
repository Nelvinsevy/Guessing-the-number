package Guessing_Game;
import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		System.out.println("Hi , Welcome to the Guessing Game");
		System.out.println("Guess the number between 0 to 100");
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();//used to generate random numbers
		int guess=0;
		boolean flag=true;
		int x=rand.nextInt(101);//from 1 -100
		int count=0;
		 while(flag){
			 System.out.print("Enter the number :");
			 guess=sc.nextInt();
	      	 count++;
			 if(guess>100 || guess<0) {
				 System.out.println("Enter number between 0 & 100. ");
		      	 
			 }
			 else if(x==guess) {
		    	 System.out.println("you won and tryed "+ count+ " times");
		    	 flag=false;
		    	 sc.close();
		     }
		     else if(x<guess) {
		    	 System.out.println(" too high,Try again");
		    	 
		     }
		     else if (x>guess) {
		    	 System.out.println("too low,Try again");
		     }
		}

	}

}
