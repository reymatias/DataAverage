/**
 * Created by Reynante Matias on 6/26/2015.
 *
 * Recreated for GitHub and refactoring purposes.
 */
import java.util.Scanner;

public class DataAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int total, count;

        System.out.print("Please enter sample size: ");
        int size = input.nextInt();


        int []arr = new int[4*size]; // Number of enclosures times total sample size; Store in a single 1-D array
        int []avg = new int[4];

        for(int i = 0; i <= 3; i++) { // Loop to 4th enclosure
            System.out.println("Enter number for the enclosure " + i);
            count = 0; // Resets count for next enclosure
            total = 0; // Resets total for next enclosure

            for(int j = 0; j < size; j++) {	// Loop to sample size
                System.out.print("Enter sample #" + j + ":");
                int num = input.nextInt();

                if (num > 0) {
                    arr[i*size + j] = num;
                    total += arr[i*size + j];
                    count++;
                }
            }

            avg[i] = total/count;
            System.out.println("\n");
        }

        System.out.println("\t\tSample\tNone\tBird\tBat\t\tBoth");

        for(int j = 0; j < size; j++) {
            System.out.println("\t\t" + j + "\t\t" + arr[j] + "\t\t" + arr[size+j] + "\t\t" + arr[2*size + j] + "\t\t"
                    + arr[3*size + j]);
        }

        System.out.println("\t\t------------------------------------");
        System.out.println("Average: " + "\t\t" + avg[0] + "\t\t" + avg[1] + "\t\t" + avg[2] + "\t\t" + avg[3]);
        System.out.println("\n");

        if (avg[1] < avg[2]) {
            System.out.println("** Birds ate more! **");
        } else if (avg[1] > avg[2]) {
            System.out.println("** Bats ate more! **");
        } else {
            System.out.println("** Birds and Bats ate the same! **");
        }
    }
}
