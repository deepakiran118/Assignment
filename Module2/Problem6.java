package Module2;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        long fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;

        }
        System.out.println("Factorial:"+ fact);
    }
}
