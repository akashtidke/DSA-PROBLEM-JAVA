import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
System.out.println(add(b,n1,n2));
    }

    static int add(int b, int n1, int n2) {
        int sum = 0;
        int power = 1;
        int c = 0;
        while (b > 0 || n1 > 0 || n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int ansAdd = d1 + d2 + c;
            c = ansAdd / b;
            ansAdd = ansAdd % b;
            sum += ansAdd * power;
            power *= 10;


        }
        return sum;
    }
}
