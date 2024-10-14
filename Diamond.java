import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int userInput;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number");
    userInput = input.nextInt();

    int halfOfUserInput = userInput/2;

    //This if/else statement determines if the user input is even or odd
    if (userInput % 2 == 0) {
      //Top Half of Diamond
      for(int top = 0; top < 2; top++) {
        for(int space = 0; space < userInput - top; space++) {
          System.out.print(" ");
        }

        for(int asterisk = 0; asterisk < top + 1; asterisk++) {
          System.out.print("* ");
        }

        System.out.println(" ");
      }
    } else {
      //This runs if the user input is an odd number
      //Top Half of Diamond
      for(int top = 0; top < halfOfUserInput; top++) {
        for(int space = 0; space < halfOfUserInput - top - 1; space++) {
          System.out.print(" ");
        }

        for(int asterisk = 0; asterisk < 2 * top + 1; asterisk++) {
          System.out.print("*");
        }

        System.out.println(" ");
      }
      //Bottom Half of Diamond
      for(int bottom = halfOfUserInput - 1; bottom > 0; bottom--) {
        for(int space = 0; space < halfOfUserInput - bottom; space++) {
          System.out.print(" ");
        }

        for(int asterisk = 0; asterisk < 2 * bottom - 1; asterisk++) {
          System.out.print("*");
        }

        System.out.println(" ");
      }
    }
    input.close();
  }
}
