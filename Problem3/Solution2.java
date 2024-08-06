package Problem3;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}
