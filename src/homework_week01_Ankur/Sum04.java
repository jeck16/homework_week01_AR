package homework_week01_Ankur;

import java.util.Scanner;

public class Sum04 {
    public static void main(String[] args) {

        Scanner my= new Scanner(System.in);
        System.out.print("Input first number ");
        int firstnumber = my.nextInt();
        System.out.print("Input second number");
        int secondnumber = my.nextInt();
        int c = (firstnumber * secondnumber);
        System.out.println(firstnumber+"*"+secondnumber+"="+c);

        

    }
}
