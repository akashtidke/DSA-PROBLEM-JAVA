import java.util.Scanner;

public class digitOfno {
    public static  void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int num=n;
        int power=1;
        while(num>10){
            num=num/10;
            power=power*10;
          //  System.out.println(num+" "+power);
        }
        while (n!=0){
            int r=n%power;
            int q=n/power;
            System.out.println(q);
            n=r;
            power=power/10;
        }

    }
}
