package July_11.Assignment;

import java.util.Scanner;

public class ThreeUserInputPrintGreatestForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //!d.equals("No")
        for (String d="Yes";(!d.equals("No")&&!d.equals("no"));) {
            System.out.println("Please Enter Three Number");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if (a > b && a > c) {
                System.out.println("Greatest among three = " + a);
            } else if (b > c) {
                System.out.println("Greatest among three = " + b);
            } else if (c > b) {
                System.out.println("Greatest among three = " + c);
            } else if (a == c && a == b) {
                System.out.println("All the number are same");
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No to exist");
            d = input.next();
        }


    }
}
