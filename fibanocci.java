// welcome to Fibonacci Series problem

import java.util.Scanner;

public class fibanocci {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner1.nextInt();
        int[] number = new int[n];
        number[0] = 0;
        number[1] = 1;
        System.out.println(+ number[0]);
        System.out.println(+ number[1]);
        for (int i = 2; i < n; i++){
            number[i] = number[i - 1] + number[i - 2];
            System.out.println(+ number[i]);
        }
    }
}
