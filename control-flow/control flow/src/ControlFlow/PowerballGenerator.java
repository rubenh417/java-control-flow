import java.util.Scanner;
import java.util.Random;

public class PowerballGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Please enter your name: ");
        String name = scanner.next();

        System.out.print("Hello " + name + ", would you like to continue to the interactive portion? (yes or no): ");
        String continueResponse = scanner.next();

        class AsciiChars 
{
  public static void printNumbers()
  {
    for(int i = 48; i <= 57; i++)
    {
      System.out.print((char)i + " ");
    }
    System.out.println();
  }

  public static void printLowerCase()
  {
    for(int i = 97; i <= 122; i++)
    {
      System.out.print((char)i + " ");
    }
    System.out.println();
  }

  public static void printUpperCase()
  {
    for(int i = 65; i <= 90; i++)
    {
      System.out.print((char)i + " ");
    }
    System.out.println();
  }
}

        if (!continueResponse.equalsIgnoreCase("yes") && !continueResponse.equalsIgnoreCase("y")) {
            System.out.println("Please return later to complete the survey.");
            System.exit(0);
        }

        while (true) {
            System.out.print("Do you have a red car? (yes, no): ");
            String redCarResponse = scanner.next();

            System.out.print("What is the name of your favorite pet? ");
            String petName = scanner.next();

            System.out.print("What is the age of your favorite pet? ");
            int petAge = scanner.nextInt();

            System.out.print("What is your lucky number? ");
            int luckyNumber = scanner.nextInt();

            System.out.print("Do you have a favorite quarterback? (yes, no): ");
            String quarterbackResponse = scanner.next();

            int jerseyNumber = 0;
            if (quarterbackResponse.equalsIgnoreCase("yes") || quarterbackResponse.equalsIgnoreCase("y")) {
                System.out.print("What is their jersey number? ");
                jerseyNumber = scanner.nextInt();
            }

            System.out.print("What is the two-digit model year of your car? ");
            int carYear = scanner.nextInt();

            System.out.print("What is the first name of your favorite actor or actress? ");
            String actorName = scanner.next();

            System.out.print("Enter a random number between 1 and 50: ");
            int randomNumber = scanner.nextInt();

            int powerball1 = (petName.charAt(petName.length() - 1)) % 59 + 1;
            int powerball2 = (jerseyNumber + carYear) % 59 + 1;
            int powerball3 = (actorName.charAt(0)) % 59 + 1;
            int powerball4 = (randomNumber % 59) + 1;
            int powerball5 = (luckyNumber % 59) + 1;

            System.out.println("Your Powerball numbers are: " + powerball1 + ", " + powerball2 + ", " + powerball3 + ", " + powerball4 + ", " + powerball5);

            System.out.print("Would you like to generate another set of numbers? (yes or no): ");
            String continueGeneratingResponse = scanner.next();

            if (!continueGeneratingResponse.equalsIgnoreCase("yes") && !continueGeneratingResponse.equalsIgnoreCase("y")) {
                System.out.println("Thank you for playing Powerball. Goodbye!");
                break;
            }
        }
    }
}
