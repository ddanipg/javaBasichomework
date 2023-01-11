package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        /* scanner is just a variable like we create primitive variables
        = => assignment operator
        system.in => tells the computer we want to read the data from keyboard.
         */
        System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+ age +" years old");
        System.out.println("please enter you weight");
        double weight=scan.nextDouble();
        System.out.println("your weight is "+ weight +" lbs");
        System.out.println("are you hungry ? ");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("please enter your gender");
        char gender=scan.next().charAt(0); // char type of input
        System.out.println("your gender is "+gender);
        System.out.println("please enter your name");
        String name= scan.next();// when we have to take only one word as input
        System.out.println("your name is "+name);
        scan.nextLine();// trick to make nextline method work after we have used any other method from scanner class.
        System.out.println("please enter your full name");
        String FullName=scan.nextLine();
        System.out.println("your full name is "+ FullName);
        scan.close(); // good practice





    }
}
