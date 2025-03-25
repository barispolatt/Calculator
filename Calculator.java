import java.util.Scanner;
import java.math.*;

public class Calculator {
    static int sum(int a, int b) {
        return a + b;
    }

    static int difference(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    static int pow(int a, int b) {
        for (int i = 1; i <= b; i++) {
            a *= a;
        }
        return a;
    }

    static double circleArea(int a) {
        double area = a*a*3.14;
        return area;
    }

    static double circlePerimeter(int a) {
        double perimeter = 2*a*3.14;
        return perimeter;
    }

    static int rectangleArea(int a, int b) {
        int area = a*b;
        return area;
    }

    static int rectanglePerimeter(int a, int b) {
        int perimeter = (2*a)+(2*b);
        return perimeter;
    }

    static double areaTriangle(int a, int h) {
        double area = 0.5*a*h;
        return area;

    }

    static int areaSquare(int a) {
        return a*a;
    }

    static int perimeterSquare(int a) {
        return 4*a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation: ");
        System.out.println("1- Addition ");
        System.out.println("2- Subtraction ");
        System.out.println("3- Multiplication ");
        System.out.println("4- Division ");
        System.out.println("5- Modulus");
        System.out.println("5- Power: ");
        System.out.println("6- Area and Perimeter of Rectangle ");
        System.out.println("7- Area and Perimeter of Circle ");
        System.out.println("8- Area of Triangle ");
        System.out.println("9- Area and Perimeter of Square ");
        System.out.println("0- Exit");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                System.out.println("Enter the first number: ");
                int a1 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b1 = sc.nextInt();
                System.out.print("Result: " + sum(a1, b1));
                break;
            case 2:
                System.out.println("Enter the first number: ");
                int a2 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b2 = sc.nextInt();
                System.out.print("Result: " + difference(a2, b2));
                break;
            case 3:
                System.out.println("Enter the first number: ");
                int a3 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b3 = sc.nextInt();
                System.out.print("Result: " + multiply(a3, b3));
                break;
            case 4:
                System.out.println("Enter the first number: ");
                int a4 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b4 = sc.nextInt();
                System.out.print("Result: " + divide(a4, b4));
                break;
            case 5:
                System.out.println("Enter the first number: ");
                int a5 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b5 = sc.nextInt();
                System.out.print("Result: " + modulus(a5, b5));
            case 6:
                System.out.println("Enter the number to be exponentiated: ");
                int a6 = sc.nextInt();
                System.out.println("Enter the exponent: ");
                int b6 = sc.nextInt();
                System.out.print("Result: " + pow(a6, b6));
                break;
            case 7:
                System.out.println("Enter the radius of the circle: ");
                int a7 = sc.nextInt();

        }


        int a = sc.nextInt();

    }
}
