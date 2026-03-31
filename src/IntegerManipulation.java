import java.util.Arrays;
import java.util.Scanner;

public class IntegerManipulation {

    public static void sizeableBubbleSorting(Scanner scanner) {
        int[] a = new int[100];

        // user input
        System.out.print("Enter the size of your array: ");
        int length = scanner.nextInt();
        System.out.printf("Enter %d number/s:\n", length);

        // sizing the array
        for (int i = 0; i < length; i++) a[i] = scanner.nextInt();

        // index and comparison
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                } // to reverse sort, do a[j] < a[j + 1]
            }
        }

        // result
        System.out.print("\nSorted successfully: ");
        for (int i = 0; i < length; i++) System.out.printf("%d ", a[i]);
        System.out.println("\n");
    }

    public static void primitiveBubbleSorting(Scanner scanner) {
        int temp;

        // user input
        System.out.println("Sorting the 3 integers you'll give");
        System.out.print("Enter the first integer: ");
        int firstInt = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondInt = scanner.nextInt();
        System.out.print("Enter the final integer: ");
        int thirdInt = scanner.nextInt();

        // sorting
        if (firstInt > secondInt) {
            temp = firstInt;
            firstInt = secondInt;
            secondInt = temp;
        }
        if (firstInt > thirdInt) {
            temp = firstInt;
            firstInt = thirdInt;
            thirdInt = temp;
        }
        if (secondInt > thirdInt) {
            temp = secondInt;
            secondInt = thirdInt;
            thirdInt = temp;
        }

        // result
        System.out.printf("\nSorted successfully: %d %d %d\n\n", firstInt, secondInt, thirdInt);
    }

    public static void arraySorting(Scanner scanner) {
        int[] unsorted = new int[100];

        // user input
        System.out.print("Enter the size of your array: ");
        int length = scanner.nextInt();
        System.out.printf("Enter %d number/s:\n", length);

        // sizing the array
        for (int i = 0; i < length; i++) unsorted[i] = scanner.nextInt();

        // sorting (arr, start, end) index starts at 0
        Arrays.sort(unsorted, 0, length);

        // result
        System.out.print("\nSorted successfully: ");
        for (int i = 0; i < length; i++) System.out.printf("%d ", unsorted[i]);
        System.out.println("\n");
    }

    public static void reversedInt(Scanner scanner){
        int reversedNumber=0;

        //user input
        System.out.print("Enter some numbers: ");
        int numbers = scanner.nextInt();

        //reversing
        while(numbers != 0){
            int lastDigit = numbers % 10;

            //check if overflow
            if((reversedNumber > Integer.MAX_VALUE / 10 || reversedNumber < Integer.MIN_VALUE / 10)){
                System.out.println("Overflow occurred!");
                return;
            }

            reversedNumber = reversedNumber * 10 + lastDigit;
            numbers = numbers /  10;
        }

        //result
        System.out.printf("\nReversed Successfully: %d\n\n", reversedNumber);
    }

    public static void palindromeInt(Scanner scanner){
        int reversedNumber = 0;

        //user input
        System.out.print("Enter some numbers: ");
        int numbers = scanner.nextInt();
        int ogNum = numbers; //preserved the original number for later comparison

        //reversing
        while(numbers != 0){
            int lastDigit = numbers % 10;

            //check if overflow
            if((reversedNumber > Integer.MAX_VALUE / 10 || reversedNumber < Integer.MIN_VALUE / 10)){
                System.out.println("Overflow occurred!");
                return;
            }

            reversedNumber = reversedNumber * 10 + lastDigit;
            numbers = numbers /  10;
        }

        //output
        System.out.printf("\nOutput: %s\n", reversedNumber);

        //check if palindrome or not
        if(reversedNumber == ogNum) System.out.println("Palindrome!");
        else System.out.println("NOT Palindrome!");
    }

    public static void integerManipulation(Scanner scanner){
        //menu
        int choice;

        do{
            System.out.println("\nINTEGER MANIPULATION");
            System.out.println("1. Bubble Sort (Array)");
            System.out.println("2. Bubble Sort (3 Integers)");
            System.out.println("3. Built-in Sort");
            System.out.println("4. Reverse Integer");
            System.out.println("5. Palindrome Check");
            System.out.println("6. Back to Main Menu");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    sizeableBubbleSorting(scanner);
                    break;
                case 2:
                    primitiveBubbleSorting(scanner);
                    break;
                case 3:
                    arraySorting(scanner);
                    break;
                case 4:
                    reversedInt(scanner);
                    break;
                case 5:
                    palindromeInt(scanner);
                    break;
                case 6:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while(choice != 6);
    }
}