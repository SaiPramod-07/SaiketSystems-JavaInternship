package SaiKetSystems_Internship.NumberGuessingGame;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int randomNumber=random.nextInt(100)+1;
        System.out.println("--------WELCOME TO NUMBER GUESSING GAME--------");
        int count=1;
        while (true)
        {
            System.out.print("Enter your guess(1 to 100):");
            int userGuess=input.nextInt();
            if(userGuess<=0 || userGuess>=101)
            {
                System.out.println("Please enter number between 1 to 100...");
                continue;
            }
            if(userGuess==randomNumber)
            {
                if(count>1)
                {
                    System.out.println("Correct✅! You guessed in "+count+" attempts");
                }
                else
                {
                    System.out.println("Correct✅! You guessed in "+count+" attempt");
                }
                System.out.print("Do you want to play again(Yes/No):");
                String playAgain=input.next();
                if(playAgain.equalsIgnoreCase("yes"))
                {
                    System.out.println("--------Starting New Game--------");
                    randomNumber=random.nextInt(100)+1;
                    count=1;
                    continue;
                }
                else if(playAgain.equalsIgnoreCase("no"))
                {
                    System.out.println("Thank You for Playing!");
                    break;
                }
                else
                {
                    System.out.println("Invalid choice... Thank You!");
                    break;
                }
            }
            int UG_RN_Diff=Math.abs(userGuess-randomNumber);
            if(UG_RN_Diff<=5)
            {
                System.out.println("Close! Try again...");
            } else if (userGuess>randomNumber)
            {
                System.out.println("Too high! Try again...");
            }
            else
            {
                System.out.println("Too low! Try again...");
            }
            count=count+1;
        }
    }
}
