package Methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(j != n - 1) {
                    System.out.print(n + " ");
                }else{
                    System.out.print(n);
                }
            } System.out.println();
        }
    }
}

