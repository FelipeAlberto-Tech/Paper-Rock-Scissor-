import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.println("Paper = 0 " + "Rock = 1 " + "Scissor = 2");
        //display the instructions

        System.out.println("Enter your choice = ");
        int choice = input.nextInt();
        //input your choice

        int Computer = (int)(System.currentTimeMillis() % 2);
        //Computer random system

        switch (Computer) {
            case 0:
                System.out.println("Computer Choice: Paper");
                break;
            case 1:
                System.out.println("Computer Choice: Rock");
                break;
            case 2:
                System.out.println("Computer Choice: Scissor");
                break;
        }
        //Computer Choice

        if (choice == Computer) {
            System.out.println("Draw!");
        } else if ((choice == 0 && Computer == 1) ||
                (choice == 1 && Computer == 2) ||
                (choice == 3 && Computer == 0)) {
            System.out.println("You win!");
            //I looked into how to get in, and since there wasn't
            // any logic connector that worked for creating this mini-game ("&&" == "and")
        } else if (choice <= -1) {
            System.out.println("Follow the instructions!!!");
        } else if (choice > 2) {
            System.out.println("Follow the instructions!!!");
            // I've created an additional "else if" to prevent invalid inputs.

        }else {
            System.out.println("you lose!");
        }
        //Win or lose condition
    }
}