import java.util.Scanner;

public class anybasetoDecimal {
    public static  void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
System.out.println(abtd(n,b));
    }
    static  int abtd(int n,int b){
        int ans=0;
        int power=1;

        while (n!=0){
            int r=n%10;
            n=n/10;
           ans+=(r*power);
           power*=b;

        }

        return ans;
    }
}
