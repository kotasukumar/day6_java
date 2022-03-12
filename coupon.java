// welcome to coupon number program

import java.util.Random;
import java.util.Scanner;

public class coupon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n above 100: ");
        int n = scanner.nextInt();
        Random random = new Random();
        for (int i = 1; i <= 10; i++){
            int random_number = random.nextInt(n);
            System.out.println("coupon number is:  " + random_number);
        }
    }
}
