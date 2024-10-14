//Made by Kai Denton

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
      //First Two Lines
      for(int top = 0; top < 2; top++) {
        for(int space = 0; space < userInput - top; space++) {
          System.out.print(" ");
        }

        for(int asterisk = 0; asterisk < top + 1; asterisk++) {
          System.out.print("* ");
        }

        System.out.println(" ");
      }
      //After the second line until the middle of the diamond
      for(int top = 2; top < halfOfUserInput + 1; top++) {
        for(int space = 0; space < userInput - 2 * top + 1; space++) {
          System.out.print(" ");
        }

        for(int asterisk = 0; asterisk < 2 * top; asterisk++) {
          System.out.print("* ");
        }
        System.out.println(" ");
      }
      //Bottom Half of Diamond
      //After the middle of the diamond until the second to last line
      for(int bottom = halfOfUserInput; bottom > 2; bottom--) {
        for(int space = 0; space < userInput - 2 * bottom + 3; space++) {
          System.out.print(" ");
        }
  
        for(int asterisk = 0; asterisk < 2 * bottom - 2; asterisk++) {
          System.out.print("* ");
        }
  
        System.out.println(" ");
      }
      //Last two lines (If user input is 2, it will print one asterisk)
      if(userInput == 2) {
        System.out.print("  *");
        System.out.println(" ");
      } else {
        for(int bottom = 2; bottom > 0; bottom--){
          for(int space = 0; space < userInput - bottom + 1; space++) {
            System.out.print(" ");
          }
  
          for(int asterisk = 0; asterisk < bottom; asterisk++) {
            System.out.print("* ");
          }
  
          System.out.println(" ");
        }
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
