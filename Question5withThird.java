package Module1;

import java.util.Scanner;
public class Question5withoutThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number(a):");
        int a = sc.nextInt();
        System.out.println("Enter the second number(b):");
        int b = sc.nextInt();
        System.out.println("Before Swapping:a="+a+",b="+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap:a="+a+",b="+b);

    }
}
