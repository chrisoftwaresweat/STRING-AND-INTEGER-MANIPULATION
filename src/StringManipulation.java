import java.util.Arrays;
import java.util.Scanner;
public class StringManipulation {
    public static void stringSorting(Scanner scanner){
        //user input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        //turn it into an array
        char a[] = word.toCharArray();

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length-1; j++){
                if(a[j] > a[j+1]){char temp = a[j]; a[j] = a[j+1]; a[j+1] = temp;}
            }
        }

        //output
        System.out.print("\nOutput: ");
        for(int i = 0; i<a.length; i++) System.out.printf("%c", a[i]);
        System.out.println();
    }

    public static void strArraySorting(Scanner scanner){
        //user input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        //turn it into an array
        char a[] = word.toCharArray();

        //array sort built-in
        Arrays.sort(a);
        String sorted = new String(a);

        //output
        System.out.printf("\nOutput: %s\n\n", sorted);
    }

    public static void reverseString(Scanner scanner){
        String reversedWord = "";

        //user input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        //reversing the word using its index
        //take note index starts at 0
        for(int i = word.length()-1; i>=0; i--){
            reversedWord += word.charAt(i);
        }

        //result
        System.out.printf("\nOutput: %s\n\n", reversedWord);
    }

    public static void palindromeStr(Scanner scanner) {
        String reversedWord = "";

        //user input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String ogWord = word; //made a copy for later comparison

        //reversing the word using its index
        //take note index starts at 0
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        //output
        System.out.printf("\nOutput: %s\n", reversedWord);

        //check if palindrome or not
        if (reversedWord.equals(ogWord)) System.out.println("Palindrome!");
        else System.out.println("NOT Palindrome!");
    }

    public static void stringManipulation(Scanner scanner){
        //menu
        int choice;

        do{
            System.out.println("\nSTRING MANIPULATION");
            System.out.println("1. Bubble Sort String");
            System.out.println("2. Built-in Sort String");
            System.out.println("3. Reverse String");
            System.out.println("4. Palindrome Check");
            System.out.println("5. Back to Main Menu");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); //to remove newline

            switch(choice){
                case 1:
                    stringSorting(scanner);
                    break;
                case 2:
                    strArraySorting(scanner);
                    break;
                case 3:
                    reverseString(scanner);
                    break;
                case 4:
                    palindromeStr(scanner);
                    break;
                case 5:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while(choice != 5);
    }
}
