import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        // for (int i= a; i<=b;i++)
        // if (i%5==0&&i%3==0){
        //System.out.print(i+" ");
        // c+=i;
        // System.out.print(c+" ");


        int res = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                res = res + i;
            }
            System.out.print(res + " ");


        }


    }

}
