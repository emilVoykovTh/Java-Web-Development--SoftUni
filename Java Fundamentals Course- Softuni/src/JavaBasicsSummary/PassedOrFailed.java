package JavaBasicsSummary;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double grade = Double.parseDouble(scanner.nextLine());

        if(grade >= 3.00){
            System.out.println("JavaBasicsSummary.Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
