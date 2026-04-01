import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation {

    private Scanner scanner;

    public StringManipulation(Scanner scanner){
        this.scanner = scanner;
    }

    public void stringSorting(){
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        char a[] = word.toCharArray();

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length-1; j++){
                if(a[j] > a[j+1]){
                    char temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.print("\nOutput: ");
        for(int i = 0; i<a.length; i++) System.out.printf("%c", a[i]);
        System.out.println();
    }

    public void strArraySorting(){
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        char a[] = word.toCharArray();

        Arrays.sort(a);
        String sorted = new String(a);

        System.out.printf("\nOutput: %s\n\n", sorted);
    }

    public void reverseString(){
        String reversedWord = "";

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        for(int i = word.length()-1; i>=0; i--){
            reversedWord += word.charAt(i);
        }

        System.out.printf("\nOutput: %s\n\n", reversedWord);
    }

    public void palindromeStr() {
        String reversedWord = "";

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String ogWord = word;

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.printf("\nOutput: %s\n", reversedWord);

        if (reversedWord.equals(ogWord)) System.out.println("Palindrome!");
        else System.out.println("NOT Palindrome!");
    }

    public void stringManipulation(){
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
            scanner.nextLine(); // newline fix

            switch(choice){
                case 1:
                    stringSorting();
                    break;
                case 2:
                    strArraySorting();
                    break;
                case 3:
                    reverseString();
                    break;
                case 4:
                    palindromeStr();
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
