package Module1;

import java.util.Scanner;

public class Question5withThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number(a):");
        int a = sc.nextInt();
        System.out.println("Enter the second number(b):");
        int b = sc.nextInt();
        System.out.println("Before Swapping:a="+a+",b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap:a=" + a +",b=" + b);
    }
}
