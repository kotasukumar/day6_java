// welcome to perfect number program

import java.util.Scanner;

public class perfect_number {

    public static void main(String[] args) {
	int perfect_number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = scanner.nextInt();
        System.out.println("Perfect numbers in the given range are: ");
        for (int number = 0; number < range; number++) {
            perfect_number = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    perfect_number = perfect_number + i;
                    if (perfect_number == number) {
                        System.out.println( + perfect_number);
                    }
                }
            }
        }
    }
}
