import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner input = new Scanner(System.in);

        // Scans how many integers in an array.
        int count = input.nextInt();

        // Declare the array here
        int[] array = new int[count];

        // User fills up the array.
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }

        // Scans the key.
        int key = input.nextInt();

        // Closes the scanner.
        input.close();

        // Searches for the key in reverse order via Linear Search.
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == key) {
                System.out.println(array.length - i - 1);
                break;
            }
        }
    }
}
