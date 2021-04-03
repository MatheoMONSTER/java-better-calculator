package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(0,0);
        calc1.showInput();

    }
}
class Calculator
{
    double a;
    double b;

    public Calculator(double x,double y)
    {
        a=x;
        b=y;
    }
    public void showInput()
    {
        Scanner numbers = new Scanner(System.in);
        double a = numbers.nextDouble();
        char sign = numbers.next().charAt(0);
        double b = numbers.nextDouble();

        switch(sign)
        {
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> System.out.println(a/b);
            case '%' -> System.out.println(a%b);
            default -> System.out.println("Incorrect input");
        }

    }
}
