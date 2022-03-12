// welcome to prime number program

import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
	    int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = scanner.nextInt();
        System.out.println("prime numbers in the given range are: ");
        for (int number =2; number <= range; number++) {
            count = 0;
            for (int i = 1; i < number + 1; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    System.out.println( + number);
                }
        }
    }
}
