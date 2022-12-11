import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOne = 0;
        int numTwo = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.print("What is your first number: ");
        {
            if (in.hasNextInt()) {
                numOne = in.nextInt();
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a number.");
            }
        }
        {
            System.out.print("What is your second number: ");
            if (in.hasNextInt()) {
                numTwo = in.nextInt();
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a number.");
            }

            if (numOne == numTwo) {
                System.out.println("Your numbers are equal to eachother!");
            }
            if (numOne > numTwo) {
                System.out.println(numOne + " is larger than " + numTwo + ".");
            }
            if (numOne < numTwo) {
                System.out.println(numOne + " is lesser than " + numTwo + ".");
            }

        }
    }
}