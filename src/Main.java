import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerManipulation integerManipulation = new IntegerManipulation();
        StringManipulation stringManipulation = new StringManipulation();

        //main menu
        int userChoice;

        do{
            //user input
            System.out.println("\nWhat dy wanna see?");
            System.out.println("1. String Manipulation");
            System.out.println("2. Integer Manipulation");
            System.out.print("3. TO EXIT\nYour choice: ");
            userChoice = scanner.nextInt();

            switch (userChoice){
                case 1:
                    StringManipulation.stringManipulation(scanner);
                    break;
                case 2:
                    IntegerManipulation.integerManipulation(scanner);
                    break;
                case 3:
                    System.out.println("HOPE YOU LEARNED SOMETHING!");
                    break;
                default :
                    System.out.println("Invalid answer!");
            }
        }while(userChoice!=3);

        scanner.close();
    }
}