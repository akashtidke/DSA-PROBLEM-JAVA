import java.util.Scanner;

public class rotate {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ro=scn.nextInt();
        int num=n;
        int cnt=0;
        while(num!=0){
            num=num/10;
            cnt++;
        }
      //  System.out.println(cnt);

        int div=1;
        int mult=1;
        for (int i = 1; i <=cnt ; i++)  {
            if (i<=ro){
        div*=10;
            }else {
        mult*=10;
         }
        }
        System.out.println(div);
        System.out.println(mult);
       int r=n%div;
        int q=n/div;
        System.out.println(r*mult+q);

    }
}
