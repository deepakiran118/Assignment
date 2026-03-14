package Module1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("Area:"+area);
    }
}