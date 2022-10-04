package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---'---'`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char z= 'Z' ;
        int hexa  = 0Xface;
        int octal = 012;
        long l = 80L;
        float f1 = 44e-1f;
        float f2 = 5.5f;
        double d = 8.88e1d;
        double e = 99.9;

        int v = (int) l;
        int k1 = (int) f1;
        int k2 = (int) f2;
        int y1 = (int) d;
        int y2 = (int) e;

        System.out.println(z + hexa + octal + v + k1 + k2 + y1 + y2);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);


        int num1, num2;


        System.out.println("Enter the first number:");
        num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);


    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x = 8;
        int y = 7;
        System.out.println("Before swapping: ");
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping: ");
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.println("n1:");
        int n1 = sc.nextInt();
        System.out.println("n2:");
        int n2 = sc.nextInt();
        if (n1>n2) System.out.println("n1>n2");
        if (n1<n2) System.out.println("n1<n2");
        if (n1==n2) System.out.println("n1=n2");
        }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your annual revenue:");
        int annualRevenue = sc.nextInt();
        if (annualRevenue<0 || annualRevenue>=100000) System.out.println("Invalid Revenue");
        if (annualRevenue>=0 && annualRevenue<20000) System.out.println("Poor sales revenue");
        if (annualRevenue>=20000 && annualRevenue<50000) System.out.println("Average sales revenue");
        if (annualRevenue>=50000 && annualRevenue<80000) System.out.println("Good sales revenue");
        if (annualRevenue>=80000 && annualRevenue<100000) System.out.println("Excellent sales revenue");
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CommisionCLass");
        int CommisionClass = sc.nextInt();
        switch (CommisionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.00");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.println("Year:");
        int year = sc.nextInt();
        if (year%4!=0) System.out.println("Not a leapyear");
        else{if(year%100==0 && year%400!=0 ) System.out.println("Not a leapyear");
            else {
            System.out.println("Leapyear");

        }

        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}