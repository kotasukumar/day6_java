// welcome to stop watch program

import java.util.Scanner;

public class stop_watch {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter start point and end point of stop watch: ");
        float start_time = scanner1.nextFloat();
        float end_time = scanner1.nextFloat();
        float elapsed_time = end_time - start_time;
        System.out.println("elapsed time of stop watch is:  " + elapsed_time);
    }
}
